package com.valerastudy.Array;

public class L01_SortAndSearch4_bubbleSort {
    static void bubbleSort(int[] a) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        L01_SortAndSearch1.printArray("Array before sort", arr);
        bubbleSort(arr);
        L01_SortAndSearch1.printArray("Array after sort", arr);
    }

}
