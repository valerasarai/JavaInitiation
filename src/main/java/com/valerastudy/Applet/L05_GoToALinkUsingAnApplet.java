package com.valerastudy.Applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class L05_GoToALinkUsingAnApplet extends Applet implements ActionListener {
    public void init() {
        String link = "yahoo";
        Button b = new Button(link);
        b.addActionListener(this);
        add(b);
    }

    public void actionPerformed(ActionEvent ae) {
        Button src = (Button) ae.getSource();
        String link = "http://www." + src.getLabel() + ".com";

        try {
            AppletContext a = getAppletContext();
            URL u = new URL(link);
            a.showDocument(u, "_self");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}