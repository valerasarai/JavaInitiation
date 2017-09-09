package com.valerastudy.Networking;

import java.io.IOException;
import java.net.*;

public class L13_CreateASocket {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("localhost");
            Socket theSocket = new Socket(addr, 6123);
            System.out.println("Connected to "
                    + theSocket.getInetAddress()
                    + " on port " + theSocket.getPort() + " from port "
                    + theSocket.getLocalPort() + " of "
                    + theSocket.getLocalAddress());
        } catch (UnknownHostException e) {
            System.err.println("I can't find " + e);
        } catch (SocketException e) {
            System.err.println("Could not connect to " + e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
