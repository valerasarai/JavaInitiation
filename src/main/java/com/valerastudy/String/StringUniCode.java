package com.valerastudy.String;

public class StringUniCode {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        System.out.println("String-ul inainte de test: " + string1);
        System.out.println("Unicode code point at"
                +" position 5 in the string is = "
                +  string1.codePointBefore(5));
    }
}
