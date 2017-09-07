package com.valerastudy.Array;

import java.util.Arrays;

public class L10_Compare2Arrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        int arr3[] = arr1;

        System.out.println("Method 1 (verificarea adreselor) arr1=arr2:");
        if (arr1 == arr2) {
            System.out.println("Array is equal!");
        } else {
            System.out.println("Array is not same!");
        }

        System.out.println("\nMethod 1 (verificarea adreselor) arr1=arr3:");
        if (arr1 == arr3) {
            System.out.println("Array is equal!");
        } else {
            System.out.println("Array is not same!");
        }

        System.out.println("\nMethod 2 (verificarea continutului):");
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Array is equal!");
        } else {
            System.out.println("Array is not same!");
        }
    }
}
