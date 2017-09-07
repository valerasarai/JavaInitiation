package com.valerastudy.Array;

import java.util.ArrayList;

public class L14_FindObjectInArray {
    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();
        ArrayList obj2 = new ArrayList();
        obj2.add(0,"This");
        obj2.add(1,"is");
        obj2.add(2,"a");
        obj2.add(3,"Book!");
        obj1.add(0,"This");
        obj1.add(1,"is");
        obj1.add(2,"a");
        obj1.add(3,"Book!");

        L01_SortAndSearch1.printArray("Array 1", obj1.toArray());
        L01_SortAndSearch1.printArray("Array 2", obj2.toArray());

        System.out.println("Array 1 contains \"Book!\" - " + obj1.contains("Book!"));
        System.out.println("Array 2 contains Array1 - " + obj2.contains(obj1));

    }
}
