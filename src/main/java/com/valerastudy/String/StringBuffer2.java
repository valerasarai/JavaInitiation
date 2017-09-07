package com.valerastudy.String;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("is a ");
        sb.append("Book!");
        sb.insert(0, "This ");
        System.out.print(sb);
    }
}
