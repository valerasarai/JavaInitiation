package com.valerastudy.Array;

import java.util.ArrayList;

public class L11_RemoveAnElement1 {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.clear();
        obj.add(0,"This");
        obj.add(1,"is a");
        obj.add(2,"Book!");

        L01_SortAndSearch1.printArray("Before remooving", obj.toArray());

        obj.remove(1);

        L01_SortAndSearch1.printArray("After remooving", obj.toArray());

    }
}
