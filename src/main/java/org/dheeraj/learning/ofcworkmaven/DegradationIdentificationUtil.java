package org.dheeraj.learning.ofcworkmaven;

import org.apache.commons.beanutils.BeanUtils;
import org.dheeraj.learning.entities.ParamData;
import org.dheeraj.learning.entities.PerfStatsDTO;
import org.dheeraj.learning.entities.PrDataPerformancestatsEntity;
import org.dheeraj.learning.entities.ScenarioData;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class DegradationIdentificationUtil {
    private static SessionFactory factory;
    private static ScenarioData scenarioData = new ScenarioData();

    public static void main(String[] args) {
        try {
            File f = new File("src/main/resources/hibernate.cfg.xml");
            factory = new Configuration().configure(f).buildSessionFactory();

            //TestData
            scenarioData.setTestname("ChaseMidas");
            scenarioData.setLatestbuild("PRPC-HEAD-6902");
            scenarioData.addParam("totalreqtime");
            scenarioData.addParam("rdbiocount");

            List<String> paramList = new ArrayList<>();
            paramList.add("totalreqtime");
            paramList.add("rdbiocount");
            paramList.add("commitcount");

            DegradationIdentificationUtil di = new DegradationIdentificationUtil();
            List results = di.getResults(scenarioData.getTestname(), "PRPC-HEAD-6700", "PRPC-HEAD-6901", 100);
            List resultDTOs = di.copyResultsToDTO(results);
            di.getStandardDeviation(resultDTOs, paramList );

            List latestBuild = di.getResults(scenarioData.getTestname(), scenarioData.getLatestbuild(), scenarioData.getLatestbuild(), 100);
            System.out.println("Result size : "+latestBuild.size());
            PrDataPerformancestatsEntity st = (PrDataPerformancestatsEntity)latestBuild.get(0);

            PerfStatsDTO dto = new PerfStatsDTO();
            BeanUtils.copyProperties(dto, st);

            for(String param: paramList){
                di.isDegraded(param, dto.getDouble(param));
            }

            System.out.println(scenarioData);
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public boolean isDegraded(String param, Double latestValue) {
        double mean = scenarioData.getMap().get(param).getMean();
        double standardDeviation = scenarioData.getMap().get(param).getStandardDeviation();
        double degradationPercentage;
        scenarioData.getMap().get(param).setLatestBuildValue(latestValue);
        if(latestValue > mean + 2*standardDeviation || latestValue < mean - 2*standardDeviation) {
            degradationPercentage = (((latestValue - mean) / mean) * 100);
            scenarioData.getMap().get(param).setDegradationPercentage(degradationPercentage);
            return true;
        }
        return false;
    }

    public List getResults(String scenarioName, String startBuildLabel, String endBuildLabel, Integer maxResults) {
        Session session = factory.openSession();
        Transaction tx = null;
        Query query = null;
        List list = null;

        try {
            tx = session.beginTransaction();
            query = session.createQuery("FROM PrDataPerformancestatsEntity " +
                    "where trialtype='Performance' " +
                    "and runlevel='optimized' " +
                    "and testname='" + scenarioName + "' " +
                    "and isvalidrun='true'" +
                    "and buildlabel >= '" + startBuildLabel + "' " +
                    "and buildlabel <= '" + endBuildLabel + "' " +
                    "order by teststart desc");
            query.setMaxResults(maxResults);
            list = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    public List copyResultsToDTO(List results) {
        List resultDTOs = new ArrayList();

        try {
            for (Object ent:results) {
                PerfStatsDTO dto = new PerfStatsDTO();
                BeanUtils.copyProperties(dto, ent);
                resultDTOs.add(dto);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return resultDTOs;
    }

    /* Method to  READ all the employees */
    public void getStandardDeviation(List resultDTOs) {
        int noOfRecordsWithTotalreqtime = 0, noOfRecordsWithRDBIOCount = 0;
        double sumTotalReqtime = 0.0, sumRDBIOCount =0.0;
        for (Iterator iterator = resultDTOs.iterator(); iterator.hasNext(); ) {
            PerfStatsDTO stats = (PerfStatsDTO) iterator.next();
            if (stats.getTotalreqtime() != null) {
                sumTotalReqtime += stats.getTotalreqtime().doubleValue();
                noOfRecordsWithTotalreqtime++;
            }
            if(stats.getRdbiocount() != null) {
                sumRDBIOCount += stats.getRdbiocount().doubleValue();
                noOfRecordsWithRDBIOCount++;
            }
        }

        double meanTotalreqtime = sumTotalReqtime / noOfRecordsWithTotalreqtime;
        double meanRdbiocount = sumRDBIOCount/ noOfRecordsWithRDBIOCount;
        scenarioData.getMap().get("totalreqtime").setMean(meanTotalreqtime);
        scenarioData.getMap().get("rdbiocount").setMean(meanRdbiocount);

        double sdTotalreqtime = 0.0, sdRdbiocount = 0.0;
        for (Iterator iterator = resultDTOs.iterator(); iterator.hasNext(); ) {
            PerfStatsDTO stats = (PerfStatsDTO) iterator.next();

            if (stats.getTotalreqtime() != null) {
                sdTotalreqtime += Math.pow(stats.getTotalreqtime().doubleValue() - meanTotalreqtime, 2);
            }
            if (stats.getRdbiocount() != null) {
                sdRdbiocount += Math.pow(stats.getRdbiocount().doubleValue() - meanRdbiocount, 2);
            }
        }

        scenarioData.getMap().get("totalreqtime").setStandardDeviation(Math.sqrt(sdTotalreqtime / noOfRecordsWithTotalreqtime));
        scenarioData.getMap().get("rdbiocount").setStandardDeviation(Math.sqrt(sdRdbiocount / noOfRecordsWithRDBIOCount));
    }

    public void getStandardDeviation(List resultDTOs, List<String> listOfParams) {
        Map<String, ParamData> temp = new HashMap<>();
        for(String param: listOfParams){
            temp.put(param, new ParamData(param));
        }

        for (Iterator iterator = resultDTOs.iterator(); iterator.hasNext(); ) {
            PerfStatsDTO stats = (PerfStatsDTO) iterator.next();
            for(String param : temp.keySet()){
                double sum = temp.get(param).getTempsum();
                double noOfRecords = temp.get(param).getNoOfValidRecords();
                if (stats.getDouble(param) != null) {
                     sum += stats.getDouble(param);
                     noOfRecords++;
                     temp.get(param).setTempsum(sum);
                     temp.get(param).setNoOfValidRecords(noOfRecords);
                }
            }
        }

        for(String param : temp.keySet()){
            temp.get(param).calcMean();
        }

        for (Iterator iterator = resultDTOs.iterator(); iterator.hasNext(); ) {
            PerfStatsDTO stats = (PerfStatsDTO) iterator.next();

            for(String param : temp.keySet()) {
                double sdTemp = temp.get(param).getTempSD();

                if (stats.getDouble(param) != null) {
                    sdTemp += Math.pow(stats.getDouble(param) - temp.get(param).getMean(), 2);
                    temp.get(param).setTempSD(sdTemp);
                }
            }
        }

        for(String param : temp.keySet()){
            temp.get(param).calcStandardDeviation();
        }

        scenarioData.setMap(temp);
    }
}
