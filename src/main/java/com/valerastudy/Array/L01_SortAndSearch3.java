// Linear search

package com.valerastudy.Array;

public class L01_SortAndSearch3 {
    public static void main(String[] args) {
        int[] a = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        int target = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                break;
            }
        }
    }

}
