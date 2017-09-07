package com.valerastudy.DateTime;

//Nu lucreaza normal

import java.util.Calendar;
import java.util.Date;

public class L08_RollThroughHandM {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        System.out.println("today is: " + date.toString());

        calendar.roll(Calendar.MONTH, 100);
        System.out.println("date after a month is: " + calendar.getTime().toString());

        calendar.roll(Calendar.HOUR, 70);
        System.out.println("date after a 7 hours is: " + calendar.getTime().toString());

        System.out.println();
        calendar = Calendar.getInstance();
        System.out.println("today is: " + calendar.getTime());

        calendar.roll(Calendar.YEAR, false);
        System.out.println("date after a month is: " + calendar.getTime());

        calendar.roll(Calendar.HOUR, true);
        System.out.println("date after a month is: " + calendar.getTime());

    }
}
