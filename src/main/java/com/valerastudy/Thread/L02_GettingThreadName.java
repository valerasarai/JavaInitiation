package com.valerastudy.Thread;

public class L02_GettingThreadName extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }

    public static void main(String[] args) {
        L02_GettingThreadName tt = new L02_GettingThreadName();
        tt.start();
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}