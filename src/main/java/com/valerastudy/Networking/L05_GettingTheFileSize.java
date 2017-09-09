package com.valerastudy.Networking;

import java.net.*;
import java.util.Formatter;

public class L05_GettingTheFileSize {
    public static void main(String[] argv) throws Exception {
        int size;
        URL url = new URL("http://localhost:8080/java.bmp");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();

        if (size < 0) System.out.println("Could not determine file size.");
        else System.out.println("The size of file is = " + size + " bytes");
        conn.getInputStream().close();
    }
}
