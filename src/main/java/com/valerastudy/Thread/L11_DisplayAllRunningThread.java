package com.valerastudy.Thread;

public class L11_DisplayAllRunningThread extends Thread {
    public static void main(String[] args) {
        L11_DisplayAllRunningThread t1 = new L11_DisplayAllRunningThread();
        t1.setName("thread1");
        t1.start();
        L11_DisplayAllRunningThread t2 = new L11_DisplayAllRunningThread();
        t2.setName("thread2");
        t2.start();
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);

        for (int i = 0; i < noThreads; i++) System.out.println("Thread No: " + i + " = " + lstThreads[i].getName());
    }
}