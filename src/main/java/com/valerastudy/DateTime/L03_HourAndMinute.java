package com.valerastudy.DateTime;

import java.util.Calendar;
import java.util.Formatter;

public class L03_HourAndMinute {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter = new Formatter();
        formatter.format("%tl:%tM",calendar,calendar,calendar);
        System.out.println(formatter);

        calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
    }
}
