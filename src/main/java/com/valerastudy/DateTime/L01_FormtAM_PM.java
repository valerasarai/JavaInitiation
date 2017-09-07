package com.valerastudy.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L01_FormtAM_PM {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "HH:mm:ss a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDateFormat);
        System.out.println(simpleDateFormat.format(date));
    }
}
