package com.valerastudy.Networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class L07_ConnectingSocket {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6123);
            while (true) {
                System.out.println("Listening");
                Socket sock = server.accept();
                InetAddress addr = sock.getInetAddress();
                System.out.println("Connection made to "
                        + addr.getHostName()
                        + " (" + addr.getHostAddress() + ")");
                pause(5000);
                sock.close();
            }
        } catch (IOException e) {
            System.out.println("Exception detected: " + e);
        }
    }

    private static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }
}
