package com.valerastudy.Methods;

public class L05_Enum {
    public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch (c) {
            case lamborghini:
                System.out.println("lamborghini");
                break;
            case tata:
                System.out.println("tata");
                break;
            case audi:
                System.out.println("audi");
                break;
            case fiat:
                System.out.println("fiat");
                break;
            case honda:
                System.out.println("honda");
                break;
            default:
                System.out.println("Don't know");
                break;
        }
    }
}

enum Car {
    lamborghini, tata, audi, fiat, honda
}
