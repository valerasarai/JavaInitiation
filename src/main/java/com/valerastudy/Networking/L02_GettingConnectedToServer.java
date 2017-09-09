package com.valerastudy.Networking;

import java.net.InetAddress;
import java.net.Socket;

public class L02_GettingConnectedToServer {
    public static void main(String[] args) {
        try {
            InetAddress addr;
// www.javatutorial.com
            Socket sock = new Socket("www.javatutorial.com", 80);
            addr = sock.getInetAddress();
            System.out.println("Connected to " + addr);
            sock.close();
// www.google.com
            sock = new Socket("www.google.com", 80);
            addr = sock.getInetAddress();
            System.out.println("Connected to " + addr);
            sock.close();
// localhost
            sock = new Socket("localhost", 8080);
            addr = sock.getInetAddress();
            System.out.println("Connected to " + addr);
            sock.close();

        } catch (java.io.IOException e) {
            System.out.println("Can't connect to " + args[0]);
            System.out.println(e);
        }
    }
}
