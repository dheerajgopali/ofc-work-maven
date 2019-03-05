package org.dheeraj.learning.ofcworkmaven.hashmap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        HashMap<String, String> map = new HashMap<>(10, .75f);
        /*for (int i = 0; i < 100; i++) {
            System.out.print(i+" - ");
            int n=i;
            n |= n >>> 1;
            System.out.print(1+": "+n+"-Bin:"+printBinary(n)+", ");
            n |= n >>> 2;
            System.out.print(2+": "+n+"-Bin:"+printBinary(n)+", ");
            n |= n >>> 4;
            System.out.print(3+": "+n+"-Bin:"+printBinary(n)+", ");
            n |= n >>> 8;
            System.out.print(4+": "+n+"-Bin:"+printBinary(n)+", ");
            n |= n >>> 16;
            System.out.println(n);
        }*/
    }

    public static String printBinary(int n) {

        String x = "";
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        return x;
    }
}
