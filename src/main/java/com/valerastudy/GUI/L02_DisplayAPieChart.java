package com.valerastudy.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class L02_DisplayAPieChart {
        public static void main(String[] argv) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new L02_GUI_MyComponent());
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

class L02_GUI_Slice {
    double value;
    Color color;
    public L02_GUI_Slice(double value, Color color) {
        this.value = value;
        this.color = color;
    }
}

class L02_GUI_MyComponent extends JComponent {
    L02_GUI_Slice[] slices = {
            new L02_GUI_Slice(5, Color.black), new L02_GUI_Slice(33, Color.green), new L02_GUI_Slice(20, Color.yellow), new L02_GUI_Slice(15, Color.red)
    };
    L02_GUI_MyComponent() {}
    public void paint(Graphics g) {
        drawPie((Graphics2D) g, getBounds(), slices);
    }
    void drawPie(Graphics2D g, Rectangle area, L02_GUI_Slice[] slices) {
        double total = 0.0D;

        for (int i = 0; i < slices.length; i++) {
            total += slices[i].value;
        }
        double curValue = 0.0D;
        int startAngle = 0;
        for (int i = 0; i < slices.length; i++) {
            startAngle = (int) (curValue * 360 / total);
            int arcAngle = (int) (slices[i].value * 360 / total);
            g.setColor(slices[i].color);
            g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
            curValue += slices[i].value;
        }
    }
}