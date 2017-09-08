package com.valerastudy.Methods;

class L01_Overloading1 {
    int h;

    L01_Overloading1() {
        System.out.println("bricks");
        h = 0;
    }

    L01_Overloading1(int i) {
        System.out.println("Create new h = " + i + " feet tall");
        this.h = i;
    }

    void info() {
        System.out.println("h = " + this.h);
    }

    void info(String s) {
        System.out.println(s + " h = " + this.h);
    }
}

class L01_OverloadingMain {
    public static void main(String[] args) {
        L01_Overloading1 l01_overloading1 = new L01_Overloading1(10);
        l01_overloading1.info();
        l01_overloading1.info("overload:");

        new L01_Overloading1();
        l01_overloading1.info();
        l01_overloading1.info("overload:");
    }

}
