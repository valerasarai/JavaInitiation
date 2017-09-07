package com.valerastudy.String;

public class StringCompareequl {
    public static void main(String[] args) {
        String string1 = "This is a book!";
        String string2 = "This is a book!";
        String string3 = new String("This is a Book!");

        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string3));

    }
}
