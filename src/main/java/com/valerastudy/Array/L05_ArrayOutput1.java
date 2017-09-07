package com.valerastudy.Array;

public class L05_ArrayOutput1 {
    public static void main(String[] args) {
        String[] s = new String[3];

        s[0] = "This";
        s[1] = "is a";
        s[2] = "Book!";

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
