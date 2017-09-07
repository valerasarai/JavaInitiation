package com.valerastudy.String;

public class StringOptimization {
    public static void main(String[] args) {
        String stringvar[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            stringvar[i] = "s" + i;
        }

        //Method 1
        long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringvar[i] = "Hello!";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Creation time of String Literals: " + (endTime0 - startTime0) + " ms.");

        //Method 2
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringvar[i] = new String("Hello!");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Creation time of String objects with \"new\" keyworrd: " + (endTime1 - startTime1) + " ms.");

        //Method 3
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringvar[i] = new String("Hello!");
            stringvar[i] = stringvar[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Creation time of String objects with intern(): " + (endTime2 - startTime2) + " ms.");
    }
}
