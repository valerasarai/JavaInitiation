package com.valerastudy.Array;

import java.util.Arrays;

public class L08_ArrayFilling2 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,6,3,2,9};
        L01_SortAndSearch1.printArray("Initial Array", arr);

        Arrays.fill(arr, 18);
        L01_SortAndSearch1.printArray("After fill()", arr);
    }
}
