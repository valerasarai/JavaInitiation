package com.valerastudy.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L05_DiaplaiyndCurrentTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h");
        System.out.println("Hour in \"h\" format: "+simpleDateFormat.format(date));

        simpleDateFormat.applyPattern("kk:mm:ss");
        System.out.println(simpleDateFormat.format(date));

    }

}
