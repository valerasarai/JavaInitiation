package com.valerastudy.Networking;

import java.net.URL;

public class L08_PartsOfURL {
    public static void main(String args[]) throws Exception {
        URL u = new URL("https://www.tutorialspoint.com/javaexamples/net_singleuser.htm");
        System.out.println("The URL is " + u);
        System.out.println("The file part is " + u.getFile());
        System.out.println("host is " + u.getHost());
        System.out.println("path is " + u.getPath());
        System.out.println("port is " + u.getPort());
        System.out.println("default port is " + u.getDefaultPort());

        u = new URL("https://localhost:8080/java.bmp");
        System.out.println("The URL is " + u);
        System.out.println("The file part is " + u.getFile());
        System.out.println("host is " + u.getHost());
        System.out.println("path is " + u.getPath());
        System.out.println("port is " + u.getPort());
        System.out.println("default port is " + u.getDefaultPort());
    }
}
