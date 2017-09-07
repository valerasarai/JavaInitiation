package com.valerastudy.Array;

import java.util.Arrays;

public class L08_ArrayFilling1 {
    public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        L01_SortAndSearch1.printArray("Array fill 100", array);

        Arrays.fill(array, 3, 6, 50);
        L01_SortAndSearch1.printArray("Array fill 100", array);
    }
}
