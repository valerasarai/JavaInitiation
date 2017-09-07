package com.valerastudy.Array;

public class L09_ExtendingAnArray1 {
    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C"};
        String[] extended = new String[5];

        extended[3] = "D";
        extended[4] = "E";
        L01_SortAndSearch1.printArray("Names Array", names);
        L01_SortAndSearch1.printArray("Extended Array", extended);

        System.arraycopy(names, 0, extended, 0, names.length);
        L01_SortAndSearch1.printArray("Result", extended);

    }
}
