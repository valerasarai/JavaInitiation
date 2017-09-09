package com.valerastudy.Networking;

import java.net.*;

public class L01_HostSpecificIPAddress1 {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("8.8.8.8");
        } catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + " = " + address.getHostAddress());
        System.exit(0);
    }
}
