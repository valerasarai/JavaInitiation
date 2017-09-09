package com.valerastudy.Thread;

import java.util.Timer;
import java.util.TimerTask;

public class L07_StoppingAThread {
    public static void main(String[] args) {
        final L07_Thread_CanStop stoppable = new L07_Thread_CanStop();
        stoppable.start();

        new Timer(true).schedule(new TimerTask() {
                                     public void run() {
                                         System.out.println("Requesting stop");
                                         stoppable.requestStop();
                                     }
                                 },
                350);
    }
}

class L07_Thread_CanStop extends Thread {
    private volatile boolean stop = false;
    private int counter = 0;

    public void run() {
        while (!stop && counter < 100000) {
            System.out.println(counter++);
        }
        if (stop)
            System.out.println("Detected stop");
    }

    public void requestStop() {
        stop = true;
    }
}
