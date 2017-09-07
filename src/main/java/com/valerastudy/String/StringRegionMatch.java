package com.valerastudy.String;

public class StringRegionMatch {
    public static void main(String[] args) {
        String string1 = "Tnis is a Book!";
        String string2 = "I like this Book!";

        int startString1 = 10;
        int startString2 = 12;
        int lenMatch = 4;

        System.out.println("String 1: " + string1 + "\nString 2: " + string2);

        boolean match = string1.regionMatches(startString1, string2, startString2, lenMatch);

        System.out.println("\nCheck 1:");
        System.out.println(" * string1["+startString1+"-"+(startString1+lenMatch)+"] == " + string1.substring(startString1,(startString1+lenMatch)));
        System.out.println(" * string2["+startString2+"-"+(startString2+lenMatch)+"] == " + string2.substring(startString2,(startString2+lenMatch)));
        System.out.println("string1["+startString1+"-"+(startString1+lenMatch)+"] == strting2["+startString2+"-"+(startString2+lenMatch)+"] :- " + match);


        startString1 = 0;
        startString2 = 12;
        lenMatch = 4;

        match = string1.regionMatches(startString1, string2, startString2, lenMatch);

        System.out.println("\nCheck 2:");
        System.out.println(" * string1["+startString1+"-"+(startString1+lenMatch)+"] == " + string1.substring(startString1,(startString1+lenMatch)));
        System.out.println(" * string2["+startString2+"-"+(startString2+lenMatch)+"] == " + string2.substring(startString2,(startString2+lenMatch)));
        System.out.println("string1["+startString1+"-"+(startString1+lenMatch)+"] == strting2["+startString2+"-"+(startString2+lenMatch)+"] :- " + match);

    }
}
