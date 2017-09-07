package com.valerastudy.String;

public class StringComparePerformance {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            String s1 = "Hello!";
            String s2 = "Hello!";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time token for creation of String literals: " + (endTime - startTime) + " miliseconds.");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String s3 = new String("Hello!");
            String s4 = new String("Hello!");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time token for creation of String Objects: " + (endTime1 - startTime1) + " miliseconds.");
    }
}
