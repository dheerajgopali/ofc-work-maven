package org.dheeraj.learning.ofcworkmaven;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MarketingDBComparison {
    static HashMap<String, Node> map = new HashMap<>();
    static class Node {
        Integer src;
        Integer dest;
        public Node(Integer src, Integer dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void main(String[] args) {
        readFromSourceFile();
        readFromDestFile();
        writeToResultFile();
        String query = "select \"pxobjclass\" as \"pxObjClass\" , \"pxreferencinginsname\" as \"pxReferencingInsName\" , \"pxruleclassname\" as \"pxRuleClassName\" , \"pyrulename\" as \"pyRuleName\" , \"pxreferencingrulesetversion\" as \"pxReferencingRuleSetVersion\" , \"pzinskey\" as \"pzInsKey\" , \"pxinsindexedclass\" as \"pxInsIndexedClass\" , \"pxreferencingdescription\" as \"pxReferencingDescription\" , \"pxinsindexedkey\" as \"pxInsIndexedKey\" , \"pxreferencingrulesetname\" as \"pxReferencingRuleSetName\" from rules.pr_index_reference where \"pxrulefamilyname\" = ? and \"pxindexpurpose\" = ? and \"pxruleobjclass\" = ? and pxObjClass = ? order by pzInsKey";
        //readSpecificQueryFromDestFile(query);
    }

    public static void readFromSourceFile(){
        FileInputStream fis = null;
        BufferedReader myInput = null;

        try {
            String currentLine;
            File file = new File("C:\\Users\\gopad\\Desktop\\Office Workspace\\Lab Workspace\\Perf Degrad Analysis\\marketing degradation issure rerun\\6266.txt");
            fis = new FileInputStream(file);
            myInput = new BufferedReader(new InputStreamReader(fis));
            String rowArray[];

            while ((currentLine = myInput.readLine()) != null) {
                rowArray = currentLine.split("\t");
                Node temp = map.get(rowArray[20]);
                if(temp==null)
                    temp = new Node(1,0);
                else
                    ++(temp.src);
                map.put(rowArray[20],temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void readFromDestFile(){
        FileInputStream fis = null;
        BufferedReader myInput = null;

        try {
            String currentLine;
            File file = new File("C:\\Users\\gopad\\Desktop\\Office Workspace\\Lab Workspace\\Perf Degrad Analysis\\marketing degradation issure rerun\\6237.txt");
            fis = new FileInputStream(file);
            myInput = new BufferedReader(new InputStreamReader(fis));
            String rowArray[];

            while ((currentLine = myInput.readLine()) != null) {
                rowArray = currentLine.split("\t");
                Node temp = map.get(rowArray[20]);
                if(temp==null)
                    temp = new Node(0,1);
                else
                    ++(temp.dest);
                map.put(rowArray[20],temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void readSpecificQueryFromDestFile(String query){
        FileInputStream fis = null;
        BufferedReader myInput = null;
        List<String> list = new ArrayList<>();
        try {
            String currentLine;
            File file = new File("C:\\Users\\gopad\\Desktop\\Office Workspace\\Lab Workspace\\Perf Degrad Analysis\\Marketing degradation issue\\dest\\dbOperations_20180920T114709_534_GMT_6237.txt");
            fis = new FileInputStream(file);
            myInput = new BufferedReader(new InputStreamReader(fis));
            String rowArray[];

            while ((currentLine = myInput.readLine()) != null) {
                rowArray = currentLine.split("\t");
                if(query.equals(rowArray[20])){
                    list.add(currentLine);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        //Write to a file

        FileOutputStream fos = null;
        BufferedWriter myOutput = null;

        try {
            Node temp = null;
            File file = new File("C:\\Users\\gopad\\Desktop\\Office Workspace\\Lab Workspace\\Perf Degrad Analysis\\Marketing degradation issue\\Result.csv");
            fos = new FileOutputStream(file);
            myOutput = new BufferedWriter(new OutputStreamWriter(fos));

            for(String str: list){
                myOutput.write(str+"\n");
            }
            myOutput.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void writeToResultFile(){
        FileOutputStream fos = null;
        BufferedWriter myOutput = null;

        try {
            Node temp = null;
            File file = new File("C:\\Users\\gopad\\Desktop\\Office Workspace\\Lab Workspace\\Perf Degrad Analysis\\Marketing degradation issure rerun\\Result.csv");
            fos = new FileOutputStream(file);
            myOutput = new BufferedWriter(new OutputStreamWriter(fos));

            for(String str: map.keySet()){
                temp = map.get(str);
                myOutput.write(str+"#"+temp.src+"#"+temp.dest+"\n");
            }
            myOutput.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
