package com.valerastudy.Methods;

public class L06_EnumConstructor {
    public static void main(String[] args) {
        System.out.println("All car price:");
        for (Car2 c : Car2.values()) {
            System.out.println(
                    c + " costs " + c.getPrice() + " thousand dollars.");
        }
    }
}

enum Car2 {
    lamborgini(900), tata(2), audi(50), fiat(15), honda(12);
    private int price;

    Car2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
