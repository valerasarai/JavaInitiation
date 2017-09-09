package com.valerastudy.Applet;

import java.applet.Applet;
import java.awt.*;

public class L07_DisplayImageUsingApplet extends Applet {
    Image img;
    MediaTracker tr;
    String cd = System.getProperty("user.dir");
    public void paint(Graphics g) {
        tr = new MediaTracker(this);
        img = getImage(getCodeBase(),  "123.bmp");
       // g.drawString(cd, 10, 100);
        tr.addImage(img,0);
        g.drawImage(img, 0, 0, this);
    }
}