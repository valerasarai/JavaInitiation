package com.valerastudy.Networking;

import java.net.*;
import java.text.SimpleDateFormat;

public class L03_FileModificationTime {
    public static void main(String[] argv) throws Exception {
        URL u;
// localhost
        u = new URL("http://127.0.0.1:8080/java.bmp");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        System.out.println("The last modification time of java.bmp is: " + sdf.format(timestamp));
//"https://www.tutorialspoint.com/cpp_standard_library/cpp_fstream_close.htm"
        u = new URL("https://www.tutorialspoint.com/cpp_standard_library/cpp_fstream_close.htm");
        uc = u.openConnection();
        uc.setUseCaches(false);
        timestamp = uc.getLastModified();
        System.out.println("The last modification time of java.bmp is: " + sdf.format(timestamp));

    }
}
