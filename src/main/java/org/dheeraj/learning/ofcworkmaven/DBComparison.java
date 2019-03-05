package org.dheeraj.learning.ofcworkmaven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DBComparison {

    public static final String COPYRIGHT = "Copyright (c) 2012  Pegasystems Inc.";
    public static final String VERSION = "$Id$";

    public static void main(String[] args) {
		/*args = new String[3];
		args[0] = "J:\\Test\\Source";
		args[1] = "J:\\Test\\Target";
		args[2] = "GA";
		args[3] = "preparedStatement,preparedStatementQuery,preparedStatementUpdate,addBatch";*/

        compareDB(args[0], args[1], args[2], args[3]);
    }


    public static void compareDB(String sourceDir, String targetDir, String comparisonType, String ops){
/*
        File source = new File(sourceDir+File.separator+"Run_3_Profile");
        File target = new File(targetDir+File.separator+"Run_3_Profile");
*/
        File source = new File(sourceDir);
        File target = new File(targetDir);

        //Check whether source Folder and Target Folder exists
        if(validateInput(source, target)){
            String filterName = "dbOperations";
            File[] dbTraceFilesInBase = source.listFiles(new DBOperationsFilter(filterName, ".txt"));
            File[] dbTraceFilesInCurrent = target.listFiles(new DBOperationsFilter(filterName, ".txt"));
            //Check there is only one source dbOperations File
            if(dbTraceFilesInBase.length == 1){
                //Check there is only one target dbOperations File
                if(dbTraceFilesInCurrent.length == 1){
                    File sourceFile = dbTraceFilesInBase[0];
                    File targetFile = dbTraceFilesInCurrent[0];
                    //Check source and target dbOperations files are valid
                    if(validateFiles(sourceFile, targetFile)){
                        //Make DBComparision directory
                        File dbCompFolder = new File(target.getAbsolutePath()+File.separator+"DBComparision_"+comparisonType);
                        dbCompFolder.mkdir();
                        File info = new File(dbCompFolder.getAbsolutePath()+File.separator+"Info.log");
                        writeInfo(info, dbTraceFilesInBase[0].getAbsolutePath(), dbTraceFilesInCurrent[0].getAbsolutePath());
                        String[] operations = null;
                        if(ops != null){
                            if(!ops.isEmpty()){
                                operations = ops.split(",");
                            }
                        } else{
                            operations = "preparedStatement,preparedStatementQuery,preparedStatementUpdate,addBatch".split(",");
                        }
                        List<String> opsList = Arrays.asList(operations);
                        ExecutorService executorService = Executors.newFixedThreadPool(2);
                        Future<Integer> baseFileCount = executorService.submit(new ProcessData(sourceFile, "Base", opsList, dbCompFolder.getAbsolutePath()));
                        Future<Integer> currFutureFileCount = executorService.submit(new ProcessData(targetFile, "Current", opsList, dbCompFolder.getAbsolutePath()));
                        executorService.shutdown();
                        while(!executorService.isTerminated()){
                            continue;
                        }
                        System.out.println("Finished creating Files based on Requestors");
                        try {
                            if(!baseFileCount.get().equals(currFutureFileCount.get())){
                                File bFile = null;
                                File cFile = null;
                                File resultFile = null;
                                ExecutorService service = Executors.newFixedThreadPool(4);
                                for(int i=1; i<=baseFileCount.get(); i++){

                                    File[] baseFiles = dbCompFolder.listFiles(new DBOperationsFilter("Base_"+(i)+"_", ".log"));
                                    File[] currentFiles = dbCompFolder.listFiles(new DBOperationsFilter("Current_"+(i)+"_", ".log"));
                                    if(baseFiles != null && currentFiles != null){
                                        bFile =baseFiles[0];
                                        cFile = currentFiles[0];
                                        String resultFileName = dbCompFolder.getAbsolutePath()+File.separator+"Result_"+(i)+"_";
                                        resultFileName = resultFileName + bFile.getName().charAt(bFile.getName().lastIndexOf("_")+1);
                                        resultFileName = resultFileName + bFile.getName().substring(bFile.getName().indexOf("-"))+".log";
                                        resultFile = new File(resultFileName);
                                        service.execute(new ProcessFiles(bFile, cFile, resultFile));
                                    }
                                }
                                service.shutdown();
                                while(!service.isTerminated()){
                                    continue;
                                }
                                System.out.println("Finished Creating Results");
                            } else{
                                System.out.println("Base file count doesnt match with Current File Count");
                            }
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        } catch (ExecutionException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } else{
                    System.out.println("More than one/No "+filterName+" phase files found in "+target.getAbsolutePath()+ " directory.");
                }
            } else{
                System.out.println("More than one/No "+filterName+" phase files found in "+source.getAbsolutePath()+ " directory.");
            }
        } else{
            System.out.println("Invalid Source or Target directories");
        }
    }

    private static void writeInfo(File info, String sourceName, String targetName) {
        FileOutputStream fos = null;
        BufferedWriter myOutput = null;
        try{
            fos = new FileOutputStream(info);
            myOutput = new BufferedWriter(new OutputStreamWriter(fos));
            myOutput.write("This folder contains information related to DBComparison of: \n\n"
                    +sourceName+"\nVS \n"+targetName);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                myOutput.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //To validate the Source and Target Folders
    private static boolean validateInput(File source, File target) {
        if(source.exists()){
            if(target.exists()){
                return true;
            } else{
                System.out.println("Target Folder:: "+target.getAbsolutePath()+" doesn't exist");
            }
        } else {
            System.out.println("Source Folder:: "+source.getAbsolutePath()+" doesn't exist");
        }
        return false;
    }

    //To validate the dbOperations source and Target Files
    public static boolean validateFiles(File baseFile, File currentFile){
        if(baseFile.exists() && currentFile.exists()){
            return true;
        }
        return false;
    }

}

class ProcessFiles implements Runnable{
    File sourceFile = null;
    File targetFile = null;
    File resultFile = null;

    public ProcessFiles(File sourceFile, File targetFile, File resultFile) {
        this.sourceFile = sourceFile;
        this.targetFile = targetFile;
        this.resultFile = resultFile;
    }

    @Override
    public void run() {
        FileOutputStream fos = null;
        BufferedWriter myOutput = null;
        try{
            Set<String> uniqueQueries = new LinkedHashSet<String>();
            Map<String, Integer> baseFileData = processFile(this.sourceFile, uniqueQueries);
            Map<String, Integer> currentFileData = processFile(this.targetFile, uniqueQueries);
            fos = new FileOutputStream(this.resultFile);
            myOutput = new BufferedWriter(new OutputStreamWriter(fos));
            int diff = 0;
            int value = 0;
            StringBuilder result = new StringBuilder();
            result.append("Query \t New \t Old \t Difference \n");
            for(String query: uniqueQueries){
                result.append(query);
                diff = value = 0;
                if(currentFileData.get(query) != null){
                    value = currentFileData.get(query);
                    result.append("\t" + value);
                }else{
                    value = 0;
                    result.append("\t" + value);
                }
                diff = value;
                if(baseFileData.get(query) != null){
                    value = baseFileData.get(query);
                    result.append("\t" + baseFileData.get(query));
                }else{
                    value = 0;
                    result.append("\t" + value);
                }
                diff = diff - value;
                result.append("\t" + diff + "\n");
            }
            myOutput.write(result+"\n");
            myOutput.flush();
            //System.out.println(result);
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                myOutput.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Map<String, Integer> processFile(File file, Set<String> uniqueQueries){
        FileInputStream fis = null;
        BufferedReader myInput = null;
        Map<String, Integer> queryCount = null;
        try{
            String currentLine;
            fis = new FileInputStream(file);
            myInput = new BufferedReader(new InputStreamReader(fis));
            queryCount = new LinkedHashMap<String, Integer>();
            while ((currentLine = myInput.readLine()) != null) {
                String oneRowArray[] = currentLine.split("\t");
                if(queryCount.containsKey(oneRowArray[20])){
                    queryCount.put(oneRowArray[20], queryCount.get(oneRowArray[20])+1);
                } else{
                    queryCount.put(oneRowArray[20], 1);
                    uniqueQueries.add(oneRowArray[20]);
                }
            }
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        } finally{
            try {
                myInput.close();
                fis.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return queryCount;
    }

}

class DBOperationsFilter implements FilenameFilter{
    String filter;
    String ext;
    public DBOperationsFilter(String filter, String ext){
        this.filter = filter;
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String fileName) {
        if(fileName.endsWith(this.ext) && fileName.contains(this.filter)){
            return true;
        }
        return false;
    }
}

class ProcessData implements Callable<Integer>{

    File file = null;
    String label = null;
    List<String> operations = null;
    String targetFolderName = null;

    public ProcessData(File file, String label, List<String> operations, String targetFolderName) {
        this.file = file;
        this.label = label;
        this.operations = operations;
        this.targetFolderName = targetFolderName;
    }

    @Override
    public Integer call() {
        Map<String, ArrayList<ArrayList<String>>> baseData = getOperations();
        return createRequestorFiles(baseData);
    }

    public Map<String, ArrayList<ArrayList<String>>> getOperations(){
        System.out.println("inside get operations");
        FileInputStream fis = null;
        BufferedReader myInput = null;
        Map<String, ArrayList<ArrayList<String>>> req = new LinkedHashMap<String, ArrayList<ArrayList<String>>>();
        try{
            String currentLine;
            fis = new FileInputStream(this.file);
            myInput = new BufferedReader(new InputStreamReader(fis));
            ArrayList<String> oneRowData = null;
            boolean firstrow = true;
            while ((currentLine = myInput.readLine()) != null) {
                String oneRowArray[] = currentLine.split("\t");
                //if(firstrow || (!oneRowArray[4].contains("unknown") && operations.contains(oneRowArray[15]))){
                //if(firstrow || (oneRowArray[4].startsWith("H") && oneRowArray[7].startsWith("User") && operations.contains(oneRowArray[15]))){
                if(firstrow || (oneRowArray[4].startsWith("B") && this.operations.contains(oneRowArray[15]))){
                    //if(firstrow || ((oneRowArray[7].startsWith("User")) && this.operations.contains(oneRowArray[15]))){
                    oneRowData = new ArrayList<String>();
                    for(String data: oneRowArray){
                        oneRowData.add(data);
                    }
                    String key = oneRowArray[4].trim();
                    if(req.containsKey(key)){
                        req.get(key).add(oneRowData);
                    } else{
                        if(!firstrow){
                            ArrayList<ArrayList<String>> rowData = new ArrayList<ArrayList<String>>();
                            rowData.add(oneRowData);
                            req.put(key, rowData);
                        }
                    }
                }
                firstrow = false;
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        } finally{
            try {
                myInput.close();
                fis.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return req;
    }

    private Integer createRequestorFiles(Map<String, ArrayList<ArrayList<String>>> baseData) {
        System.out.println("createRequestorFiles");
        File file = null;
        FileOutputStream fos = null;
        BufferedWriter myOutput = null;
        int i=0;
        try{
            for(String requestor: baseData.keySet()){
                file = new File(this.targetFolderName+File.separator+this.label+"_"+(++i)+"_"+requestor+".log");
                fos = new FileOutputStream(file);
                myOutput = new BufferedWriter(new OutputStreamWriter(fos));
                ArrayList<ArrayList<String>> reqData = baseData.get(requestor);
                for(ArrayList<String> list: reqData){
                    for(String data: list){
                        myOutput.write(data.trim()+"\t");
                    }
                    myOutput.write("\n");
                    myOutput.flush();
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        } finally{
            try {
                if(myOutput != null)
                    myOutput.close();
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return i;
    }

}