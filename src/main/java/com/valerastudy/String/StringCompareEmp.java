package com.valerastudy.String;

public class StringCompareEmp {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        String string2 = "this is a book!";
        Object objString = string1;

        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareToIgnoreCase(string2));
        System.out.println(string1.compareTo(objString.toString()));
    }
}
