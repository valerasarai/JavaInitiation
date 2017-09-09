package com.valerastudy.Applet;

import java.applet.Applet;
import java.awt.*;

public class L04_CreateDifferentShapesInAnApplet extends Applet {
    int x = 300, y = 100, r = 50;
    public void paint(Graphics g) {
        g.drawLine(30,300,200,10);
        g.drawOval(x-r,y-r,100,100);
        g.drawRect(400,50,200,100);

        g.drawRect(300,150,200,100);
        g.setColor(Color.yellow);
        g.fillRect( 300,150, 200, 100 );
        g.setColor(Color.magenta);
        g.drawString("Rectangle",500,150);
    }
}