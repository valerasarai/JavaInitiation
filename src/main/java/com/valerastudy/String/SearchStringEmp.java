package com.valerastudy.String;

public class SearchStringEmp {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        int intIndex = string1.indexOf("Book");

        System.out.println("Initial string: " + string1);

        if (intIndex == -1) {
            System.out.println("Book not found!");
        } else {
            System.out.println("Found Book al index " + intIndex);
        }
    }
}
