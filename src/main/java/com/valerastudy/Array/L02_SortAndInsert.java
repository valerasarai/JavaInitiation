package com.valerastudy.Array;

        import java.util.Arrays;

public class L02_SortAndInsert {
    public static void main(String[] args) throws Exception {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        L01_SortAndSearch1.printArray("Sorted array", array);

        int index = Arrays.binarySearch(array, 1);
        System.out.println("Didn't find 1 @ " + index);

        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        L01_SortAndSearch1.printArray("With 1 added", array);
    }

    public static int[] insertElement(int original[], int element, int index) {
        int lenght = original.length;
        int destination[] = new int[lenght + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, lenght - index);
        return destination;
    }
}
