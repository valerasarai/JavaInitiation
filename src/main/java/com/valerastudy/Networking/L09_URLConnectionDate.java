package com.valerastudy.Networking;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class L09_URLConnectionDate{

        public static void main(String args[])
                throws Exception {
            URL url = new URL("http://www.google.com");
            HttpURLConnection httpCon =
                    (HttpURLConnection) url.openConnection();
            long date = httpCon.getDate();
            if (date == 0)
                System.out.println("No date information.");
            else
                System.out.println("Date: " + new Date(date));
        }
}
