package org.dheeraj.learning.ofcworkmaven.dao.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.beanutils.BeanUtils;
import org.dheeraj.learning.ofcworkmaven.dto.ParamData;
import org.dheeraj.learning.ofcworkmaven.dto.PerfStatsDTO;
import org.dheeraj.learning.ofcworkmaven.dao.entity.PrDataPerformancestatsEntity;
import org.dheeraj.learning.ofcworkmaven.dto.ScenarioData;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class DegradationIdentificationUtil {
    private static SessionFactory factory;
    private static DegradationIdentificationUtil di = new DegradationIdentificationUtil();
    private static String START_BUILD_LABEL = "PRPC-HEAD-6814";
    private static String END_BUILD_LABEL = "PRPC-HEAD-6859";
    private static String LATEST_BUILD_LABEL = "PRPC-HEAD-6860";

    public static void main(String[] args) {
        try {
            File f = new File("src/main/resources/hibernate.cfg.xml");
            factory = new Configuration().configure(f).buildSessionFactory();

            List<String> scenariosList = new ArrayList<>();
            di.populateScenariosList(scenariosList);

            List<String> paramList = new ArrayList();
            di.populateParamsList(paramList);

            List<ScenarioData> scenarioDataList = new ArrayList<>();

            for (String scenarioName :
                    scenariosList) {
                ScenarioData scenarioData = di.callAScenario(scenarioName, paramList);
                scenarioDataList.add(scenarioData);
            }

            Gson gson = new GsonBuilder().create();
            String json = gson.toJson(scenarioDataList);// obj is your object
            System.out.println(json);


        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void populateScenariosList(List<String> list) {
        list.add("SimpleSurvey");

        /*list.add("SimpleSurvey");
        list.add("CCCASE");
        list.add("ChaseMidas");
        list.add("Mortgage");
        list.add("CallCenterJUnit");
        list.add("DataEngineJUnit");
        list.add("DevPerfJUnit");
        list.add("Integration");
        list.add("ISBANK");
        list.add("MultiChannel");
        list.add("Offline");
        list.add("RBS");
        /*list.add("PerfClip");*/
    }

    public void populateParamsList(List<String> list) {
        list.add("totalreqtime");
        list.add("rdbiocount");
        list.add("commitcount");
    }

    public ScenarioData callAScenario(String scenarioName, List<String> paramList) {
        ScenarioData scenarioData = new ScenarioData();
        scenarioData.setTestname(scenarioName);
        scenarioData.setLatestbuild(LATEST_BUILD_LABEL);

        List results = di.getResults(scenarioData.getTestname(), START_BUILD_LABEL, END_BUILD_LABEL, 100);
        List resultDTOs = di.copyResultsToDTO(results);
        Map<String, ParamData> tempMap = di.getStandardDeviation(resultDTOs, paramList);

        List latestBuild = di.getResults(scenarioData.getTestname(), LATEST_BUILD_LABEL, LATEST_BUILD_LABEL, 100);
        System.out.println("Result size : " + latestBuild.size());
        PrDataPerformancestatsEntity st = (PrDataPerformancestatsEntity) latestBuild.get(0);

        PerfStatsDTO dto = new PerfStatsDTO();
        try {
            BeanUtils.copyProperties(dto, st);
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        for (String param : paramList) {
            di.isDegraded(tempMap, param, dto.getDouble(param));
        }

        scenarioData.setMap(tempMap);

        return scenarioData;
    }

    public boolean isDegraded(Map<String, ParamData> tempMap, String param, Double latestValue) {
        double mean = tempMap.get(param).getMean();
        double standardDeviation = tempMap.get(param).getStandardDeviation();
        double degradationPercentage;
        boolean temp = false;
        tempMap.get(param).setLatestBuildValue(latestValue);
        degradationPercentage = (((latestValue - mean) / mean) * 100);
        if (latestValue > mean + 2 * standardDeviation || latestValue < mean - 2 * standardDeviation) {
            temp = true;
        }
        tempMap.get(param).setDegradationPercentage(degradationPercentage);
        tempMap.get(param).setDegraded(temp);
        return temp;
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
            for (Object ent : results) {
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

    public Map<String, ParamData> getStandardDeviation(List resultDTOs, List<String> listOfParams) {
        Map<String, ParamData> temp = new HashMap();
        for (String param : listOfParams) {
            temp.put(param, new ParamData(param));
        }

        for (Iterator iterator = resultDTOs.iterator(); iterator.hasNext(); ) {
            PerfStatsDTO stats = (PerfStatsDTO) iterator.next();
            for (String param : temp.keySet()) {
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

        for (String param : temp.keySet()) {
            temp.get(param).calcMean();
        }

        for (Iterator iterator = resultDTOs.iterator(); iterator.hasNext(); ) {
            PerfStatsDTO stats = (PerfStatsDTO) iterator.next();

            for (String param : temp.keySet()) {
                double sdTemp = temp.get(param).getTempSD();

                if (stats.getDouble(param) != null) {
                    sdTemp += Math.pow(stats.getDouble(param) - temp.get(param).getMean(), 2);
                    temp.get(param).setTempSD(sdTemp);
                }
            }
        }

        for (String param : temp.keySet()) {
            temp.get(param).calcStandardDeviation();
        }

        return temp;
    }
}
