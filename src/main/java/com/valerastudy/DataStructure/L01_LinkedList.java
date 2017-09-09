package com.valerastudy.DataStructure;

import java.util.LinkedList;

public class L01_LinkedList {
    public static void main(String[] args) {

//Ex 1 First and last element
///////////////////////////////////////////////////////////////////////////////////////////
//        lList1();
////Ex 2 First and last element
/////////////////////////////////////////////////////////////////////////////////////////////
//        lList2();
//Ex 3 Adding Element to Linked List
/////////////////////////////////////////////////////////////////////////////////////////////
//        addElementlList1();
//Ex 4 Adding Element to Linked List
///////////////////////////////////////////////////////////////////////////////////////////////
//        addElementlList2();
//Ex 5 Searching Linked List
///////////////////////////////////////////////////////////////////////////////////////////////
//        searchlList();
//Ex 6 Updating Linked List
///////////////////////////////////////////////////////////////////////////////////////////////
        updatelList();
    }

    //Ex 1 First and last element
///////////////////////////////////////////////////////////////////////////////////////////
    public static void lList1() {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("100");
        lList.add("200");
        lList.add("300");
        lList.add("400");
        lList.add("500");
        System.out.println("First element of LinkedList is : " + lList.getFirst());
        System.out.println("Last element of LinkedList is : " + lList.getLast());
    }

    //Ex 2 First and last element
///////////////////////////////////////////////////////////////////////////////////////////
    public static void lList2() {
        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println("First element is : " + lList.getFirst());
        System.out.println("Last element is : " + lList.getLast());
    }

    //Ex 3 Adding Element to Linked List
///////////////////////////////////////////////////////////////////////////////////////////
    public static void addElementlList1() {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);

        lList.addFirst("0");
        System.out.println(lList);

        lList.addLast("6");
        System.out.println(lList);
    }

    //Ex 4 Adding Element to Linked List
///////////////////////////////////////////////////////////////////////////////////////////
    public static final void addElementlList2() {
        LinkedList lList = new LinkedList();
        System.out.println("Number of items in the list: " + lList.size());
        String item1 = "foo";
        String item2 = "bar";
        String item3 = "sai";
        String item4 = "prasad";

        lList.add(item1);
        lList.add(item2);
        lList.addFirst(item3);
        System.out.println(lList);
        lList.addLast(item4);
        System.out.println(lList);
        System.out.println("Number of items in the list: " + lList.size());
    }

    //Ex 5 Searching Linked List
///////////////////////////////////////////////////////////////////////////////////////////
    public static void searchlList() {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.add("2");

        System.out.println("First index of 2 is: " +
                lList.indexOf("2"));

        System.out.println("Last index of 2 is: " +
                lList.lastIndexOf("2"));
    }

    //Ex 6 Updating Linked List
///////////////////////////////////////////////////////////////////////////////////////////
    public static void updatelList() {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("B");
        officers.add("B");
        officers.add("T");
        officers.add("H");
        officers.add("P");
        System.out.println(officers);
        officers.set(2, "M");
        System.out.println(officers);
    }
}
