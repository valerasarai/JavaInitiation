package com.valerastudy.Array;

public class L04_ReversingAnArrayList {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        L01_SortAndSearch1.printArray("Array before reverse", numbers);
        numbers = reverseArray(numbers);
        L01_SortAndSearch1.printArray("Array after reverse", numbers);
    }

    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
