package com.valerastudy.DataStructure;

import java.util.*;

public class L03_Vector {

    public static void main(String[] args) {
//Ex 1 Vector Swap Collections.swap
///////////////////////////////////////////////////////////////////////////////////////////
//        vectorSwap1();
//Ex 2 Vector Maximum
///////////////////////////////////////////////////////////////////////////////////////////
//        maxInVector();
//Ex 3 Vector Binary
///////////////////////////////////////////////////////////////////////////////////////////
        binarySearch();

    }

    //Ex 1 Vector Swap Collections.swap
///////////////////////////////////////////////////////////////////////////////////////////
    public static void vectorSwap1() {
        Vector<String> v = new Vector<String>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        System.out.println(v);
        Collections.swap(v, 0, 2);
        System.out.println("After swapping");
        System.out.println(v);
    }

    //Ex 2 Vector Maximum
///////////////////////////////////////////////////////////////////////////////////////////
    public static void maxInVector() {
        Vector<Double> v = new Vector<Double>();
        v.add(new Double("3.4324"));
        v.add(new Double("3.3532"));
        v.add(new Double("3.342"));
        v.add(new Double("3.349"));
        v.add(new Double("2.3"));
        Object obj = Collections.max(v);
        System.out.println("The max element is: " + obj);
        obj = Collections.min(v);
        System.out.println("The min element is: " + obj);
    }

    //Ex 3 Vector Binary
///////////////////////////////////////////////////////////////////////////////////////////
    public static void binarySearch() {
        Vector<String> v = new Vector<String>();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("D");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println("Element found at : " + index);
    }
}
