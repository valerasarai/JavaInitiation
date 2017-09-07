package com.valerastudy.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class L10_DisplayDifferentFormat {

    public static void main(String[] args) {
        Date date = new Date(1000000000000L);
        DateFormat[] dateFormat = new DateFormat[6];

        dateFormat[0] = DateFormat.getInstance();
        dateFormat[1] = DateFormat.getDateInstance();
        dateFormat[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.SHORT);

        for (DateFormat df : dateFormat){
            System.out.println(df.format(date));
        }


        //SimpleDateFormatExample
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(simpleDateFormat.format(date));
        simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date));
        simpleDateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        System.out.println(simpleDateFormat.format(date));

    }
}
