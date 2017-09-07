package com.valerastudy.Array;

import java.util.ArrayList;

public class L13_FindCommonElement2 {
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 3, 9, 2};
        int[] arr2 = {3, 2, 12, 9, 40, 32, 4};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    list.add(arr1[i]);
            }
        }

        L01_SortAndSearch1.printArray("Array 1", arr1);
        L01_SortAndSearch1.printArray("Array 2", arr2);
        L01_SortAndSearch1.printArray("Common elements", list.toArray());

    }
}
