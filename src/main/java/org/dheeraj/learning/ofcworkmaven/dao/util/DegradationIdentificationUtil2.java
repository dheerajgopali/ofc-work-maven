package org.dheeraj.learning.ofcworkmaven.dao.util;

public class DegradationIdentificationUtil2 {
    static double mean;
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(1);*/

        //double[] numArray = { 5674.71, 5731.71, 5603.17, 5625.83, 5887.92 };

        double[] numArray = {
                96.49,
                95.63,
                96.80,
                95.96,
                93.77,
                95.39,
                111.31,
                91.29,
                99.09,
                92.63,
                92.77,
                103.19,
                94.76,
                100.25,
                98.67,
                90.70,
                99.31,
                90.24,
                95.72,
                94.84,
                93.30,
                93.30,
                94.96,
                93.86,
                98.63,
                100.68,
                103.68,
                102.73,
                101.37,
                104.44,
                103.11,
                104.28,
                99.59,
                104.15,
                104.49,
                99.49,
                106.25,
                101.67,
                106.01,
                108.66,
                100.16,
                105.42,
                102.25,
                104.07,
                101.70,
                111.43,
                99.44,
                97.08,
                103.77,
                104.22,
                105.56,
                98.24,
                103.86,
                102.57,
                105.00,
                102.90,
                104.10,
                103.00,
                112.27,
                103.73,
                104.89,
                102.41,
                107.55,
                103.66,
                102.61,
                100.12,
                103.55,
                100.68,
                103.55,
                103.05,
                102.26,
                98.48,
                103.81,
                98.57,
                99.49,
                104.95,
                97.99,
                97.78,
                96.36,
                101.33,
                94.80,
                99.72,
                107.35,
                97.86,
                99.46,
                95.62,
                99.74,
                97.05,
                103.73,
                96.67,
                90.27,
                100.31,
                103.22,
                93.45,
                101.40,
                92.95,
                98.58,
                91.71,
                95.34,
                104.06 };

        double SD = calculateSD(numArray);

        System.out.println("Standard Deviation "+SD);
        System.out.println("Mean : "+ mean);

        double latestValue = 13900;

        if(latestValue > mean + 2*SD || latestValue < mean - 2*SD)
            System.out.println("There is "+(((latestValue - mean)/mean)*100)+" % increase in this metric");

        /*for(int i=0; i<5;i++ ){
            if(numArray[i] >= mean + 2*SD)
                System.out.println("There is spike at index : "+i+" with value : "+numArray[i]);
        }*/
    }

    public static double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
