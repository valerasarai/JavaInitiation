package com.valerastudy.String;

public class SearchlastString {
    public static void main(String[] args) {
        String string1 = "This is a Book, a good book!";

        int lastIndex = string1.lastIndexOf("Book");

        if (lastIndex == -1){
            System.out.println("Book not found!");
        } else {
            System.out.println("Last occurrence of Book is at index " + lastIndex);
        }

    }
}
