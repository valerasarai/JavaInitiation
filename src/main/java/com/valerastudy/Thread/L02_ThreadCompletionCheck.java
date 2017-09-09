package com.valerastudy.Thread;

public class L02_ThreadCompletionCheck {
    public static void main(String[] argv) throws Exception {
        Thread thread = new L02_Thread_MyThread();
        thread.start();

        if (thread.isAlive()) {
            System.out.println("Thread has not finished");
        } else {
            System.out.println("Finished");
        }
        long delayMillis = 50000;
        thread.join(delayMillis);

        if (thread.isAlive()) {
            System.out.println("thread has not finished");
        } else {
            System.out.println("Finished");
        }
        thread.join();
    }
}

class L02_Thread_MyThread extends Thread {
    boolean stop = false;

    public void run() {
        while (true) {
            if (stop) {
                return;
            }
        }
    }
}
