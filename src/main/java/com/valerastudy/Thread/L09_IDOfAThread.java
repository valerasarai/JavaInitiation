package com.valerastudy.Thread;

public class L09_IDOfAThread extends Object implements Runnable {
    private L09_Thread_ThreadID var;

    public L09_IDOfAThread(L09_Thread_ThreadID v) {
        this.var = v;
    }

    public void run() {
        try {
            print("var getThreadID = " + var.getThreadID());
            Thread.sleep(5000);
            print("var getThreadID = " + var.getThreadID());
        } catch (InterruptedException x) {
        }
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    public static void main(String[] args) {
        L09_Thread_ThreadID tid = new L09_Thread_ThreadID();
        L09_IDOfAThread shared = new L09_IDOfAThread(tid);
        try {
            Thread threadA = new Thread(shared, "threadA");
            threadA.start();
            Thread.sleep(1000);

            Thread threadB = new Thread(shared, "threadB");
            threadB.start();
            Thread.sleep(1000);

            Thread threadC = new Thread(shared, "threadC");
            threadC.start();
        } catch (InterruptedException x) {
        }
    }
}

class L09_Thread_ThreadID extends ThreadLocal {
    private int nextID;

    public L09_Thread_ThreadID() {
        nextID = 10001;
    }

    private synchronized Integer getNewID() {
        Integer id = new Integer(nextID);
        nextID++;
        return id;
    }

    protected Object initialValue() {
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID() {
        Integer id = (Integer) get();
        return id.intValue();
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}