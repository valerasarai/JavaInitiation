package com.valerastudy.DateTime;

import java.util.Calendar;
import java.util.Date;

public class L07_AddTimeToDate {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("Today is " + date.toString());

        calendar.add(Calendar.MONTH,1);
        System.out.println("Date after a month will bee " + calendar.getTime().toString());

        calendar.add(Calendar.HOUR, 7);
        System.out.println("Date after 7 hour will bee " + calendar.getTime().toString());

        calendar.add(Calendar.YEAR, 3);
        System.out.println("Date after 3 year will bee " + calendar.getTime().toString());

    }
}
