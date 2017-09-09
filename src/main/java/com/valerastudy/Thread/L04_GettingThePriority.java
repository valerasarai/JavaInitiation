package com.valerastudy.Thread;

public class L04_GettingThePriority extends Thread {
    private int countDown = 5;
    private volatile double d = 0;

    public L04_GettingThePriority(int priority) {
        setPriority(priority);
        start();
    }
    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while(true) {
            for(int i = 1; i < 100000; i++) d = d + (Math.PI + Math.E) / (double)i;
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) {
        new L04_GettingThePriority(Thread.MAX_PRIORITY);
        for(int i = 0; i < 5; i++)
            new L04_GettingThePriority(Thread.MIN_PRIORITY);
    }
}
