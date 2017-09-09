package com.valerastudy.Networking;

///???????????????????????????????????????????//////
// Ce face???????????
// Nu pot verifica, cind ma conectez la el din browser face sock.close();

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class L06_SocketToASingleClient {
    public static void main(String args[]) throws Exception {
        ServerSocket ssock = new ServerSocket(6123);
        System.out.println("Listening");
        Socket sock = ssock.accept();
        ssock.close();
        PrintStream ps = new PrintStream(sock.getOutputStream());

        for (int i = 10; i >= 0; i--) {
            ps.println(i + " from Java Source and Support.");
        }
        ps.close();
        sock.close();
    }
}
