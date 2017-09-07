package com.valerastudy.Array;

import java.util.Arrays;

public class L01_SortAndSearch1 {
    public static void main(String[] args) {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};

        Arrays.sort(array);
        printArray("Sorted array", array);
        int index = Arrays.binarySearch(array, 5);
        System.out.println("Found 5 @ " + index);
        index = Arrays.binarySearch(array, 9);
        System.out.println("Found 9 @ " + index);

    }

    public static void printArray(String message, int array1[]) {
        System.out.println(message + ": [lenght: " + array1.length + "]");
        for (int i = 0; i < array1.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array1[i]);
        }
        System.out.println();
    }
}
