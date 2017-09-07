package com.valerastudy.String;

public class RemoveCharAt {
    public static void main(String[] args) {
        String string1 = "This is a Books!";

        System.out.println("Initial string: " + string1);
        System.out.println("Changed string: " + removeCharAt(string1,14));
    }

    public static String removeCharAt(String s, int i) {
        return s.substring(0, i) + s.substring(i + 1);
    }
}
