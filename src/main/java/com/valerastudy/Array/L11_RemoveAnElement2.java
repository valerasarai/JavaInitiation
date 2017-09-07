package com.valerastudy.Array;

import java.util.ArrayList;

public class L11_RemoveAnElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(20);
        arr.add(15);
        arr.add(30);
        arr.add(45);

        L01_SortAndSearch1.printArray("Before remooving", arr.toArray());

        arr.remove(2);

        L01_SortAndSearch1.printArray("After remooving", arr.toArray());
    }
}
