package com.valerastudy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L07_Merge2Array2 {
    public static void main(String[] args) {

        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));

        Object[] c = list.toArray();

        L01_SortAndSearch1.printArray("Array a is", c);
    }
}
