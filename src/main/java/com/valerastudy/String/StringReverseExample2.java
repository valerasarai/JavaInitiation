package com.valerastudy.String;

public class StringReverseExample2 {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        char[] try1 = string1.toCharArray();

        System.out.println("Initial string: " + string1);
        System.out.print("Inverted string: ");

        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }
    }
}
