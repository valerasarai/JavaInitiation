package com.valerastudy.Thread;

public class L06_ProducerConsumerProblem {
    public static void main(String[] args) {
        L06_Thread_CubbyHole c = new L06_Thread_CubbyHole();
        L06_Thread_Producer p1 = new L06_Thread_Producer(c, 1);
        L06_Thread_Consumer c1 = new L06_Thread_Consumer(c, 1);
        p1.start();
        c1.start();
    }
}

class L06_Thread_CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        notifyAll();
        return contents;
    }
    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}

class L06_Thread_Consumer extends Thread {
    private L06_Thread_CubbyHole cubbyhole;
    private int number;

    public L06_Thread_Consumer(L06_Thread_CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("Consumer #" + this.number + " got: " + value);
        }
    }
}
class L06_Thread_Producer extends Thread {
    private L06_Thread_CubbyHole cubbyhole;
    private int number;
    public L06_Thread_Producer(L06_Thread_CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole.put(i);
            System.out.println("Producer #" + this.number + " put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}