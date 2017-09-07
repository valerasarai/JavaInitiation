package com.valerastudy.String;

public class StringReplaceEmp {
    public static void main(String[] args) {
        String string1 = "This is a Book!";

        System.out.println("Initial string: " + string1);
        System.out.println("String replace('s','u'): " + string1.replace('s', 'u'));
        System.out.println("String replaceFirst('s','u'): " + string1.replaceFirst("s", "u"));
        System.out.println("String replaceAll('s','u'): " + string1.replaceAll("s", "u"));
    }
}
