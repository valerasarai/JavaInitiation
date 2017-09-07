package com.valerastudy.String;

public class StringReverseExample1 {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        String reverse = new StringBuffer(string1).reverse().toString();

        System.out.println("Initial string: " + string1);
        System.out.println("Reversed string: " + reverse);
    }
}
