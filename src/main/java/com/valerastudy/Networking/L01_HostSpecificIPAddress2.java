package com.valerastudy.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class L01_HostSpecificIPAddress2 {
    public static void main(String[] args) {
        InetAddress ipadd;
        String hostname;
        try {
            ipadd = InetAddress.getLocalHost();
            hostname = ipadd.getHostName();
            System.out.println("Your IP address : " + ipadd);
            System.out.println("Your Hostname : " + hostname);
        } catch (UnknownHostException e) {
        }
    }
}
