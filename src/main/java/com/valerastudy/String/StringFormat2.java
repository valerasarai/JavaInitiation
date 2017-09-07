package com.valerastudy.String;

public class StringFormat2 {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        String s1 = String.format("Message is: %s",string1);
        String s2 = String.format("Value 1: %f",32.33434);
        String s3 = String.format("Value 2: %32.12f",32.33434);
        System.out.print(s1 + "\n" + s2 + "\n" + s3);
    }
}
