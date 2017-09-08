package com.valerastudy.Methods;

public class L01_Overloading2 {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        L01_Overloading2 l01_overloading2 = new L01_Overloading2();
        l01_overloading2.sum(20, 30, 40);
        l01_overloading2.sum(20, 30);
    }
}
