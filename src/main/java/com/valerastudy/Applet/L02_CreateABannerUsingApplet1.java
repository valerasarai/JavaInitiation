package com.valerastudy.Applet;

import java.applet.*;
import java.awt.*;

public class L02_CreateABannerUsingApplet1 extends Applet implements Runnable
{
    String str = "This is a simple Banner! ";
    Thread t ;
    boolean b;

    public void init() {
        setBackground(Color.gray);
        setForeground(Color.yellow);
    }

    public void start() {
        t = new Thread(this);
        b = false;
        t.start();
    }

    public void run () {
        char ch;
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(500);
                ch = str.charAt(0);
                str = str.substring(1, str.length());
                str = str + ch;
            }
            catch(InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawRect(10,10,300,100);
        g.setColor(Color.yellow);
        g.fillRect(10,10,150,100);
        g.setColor(Color.red);
        g.drawString(str, 10, 100);
    }
}