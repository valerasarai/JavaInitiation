package com.valerastudy.Applet;

import java.applet.Applet;
import java.awt.*;

public class L01_CreateAApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome in Java Applet.",40,20);
        g.drawString("This is a Book!.",40,40);
    }
}