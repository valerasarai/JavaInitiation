package com.valerastudy.Array;

public class L06_SearchMinAndMax2 {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }
        L01_SortAndSearch1.printArray("Array is", numbers);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

}
