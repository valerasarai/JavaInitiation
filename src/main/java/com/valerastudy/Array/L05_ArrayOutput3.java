package com.valerastudy.Array;

import java.util.Arrays;

public class L05_ArrayOutput3 {
    public static void main(String[] args) {
        String[][] arr1 = new String[][] {{"This", "is", "Book 1!"},{"This", "is", "Book 1!"}};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr1));
    }
}
