package com.valerastudy.String;

public class JavaStringSplitEmp2 {
    public static void main(String args[]) {
        String string1 = "This is a Book!";
        String[] words = string1.split("\\s");

        System.out.println("Example 1: " + string1);
        for (String w : words) {
            System.out.println(w);
        }

        string1 = "This-is-a-Book!";
        System.out.println("Example 2: " + string1);
        words = string1.split("-");
        for (String w : words) {
            System.out.println(w);
        }

        string1 = "This is a Book!";
        System.out.println("Example 3: " + string1);
        words = string1.split("is a ");
        for (String w : words) {
            System.out.println(w);
        }
    }
}