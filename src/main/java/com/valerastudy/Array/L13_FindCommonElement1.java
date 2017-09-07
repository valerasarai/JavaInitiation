package com.valerastudy.Array;

import java.util.ArrayList;

public class L13_FindCommonElement1 {
    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();
        ArrayList obj2 = new ArrayList();
        obj2.add(0,"This");
        obj2.add(1,"is");
        obj2.add(2,"a");
        obj2.add(3,"Book!");
        obj1.add(0,"This");
        obj1.add(1,"is");
        obj1.add(2,"!");

        L01_SortAndSearch1.printArray("Array 1", obj1.toArray());
        L01_SortAndSearch1.printArray("Array 2", obj2.toArray());

        obj1.retainAll(obj2);
        L01_SortAndSearch1.printArray("Array 1 after remove", obj1.toArray());



    }

}
