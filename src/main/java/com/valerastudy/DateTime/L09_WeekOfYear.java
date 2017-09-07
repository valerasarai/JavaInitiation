package com.valerastudy.DateTime;

//Nu lucreaza normal

import java.util.Calendar;
import java.util.Date;

public class L09_WeekOfYear {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println("today is: " + calendar.getTime());
        System.out.println("today is " + calendar.WEEK_OF_YEAR + " week of the year");
        System.out.println("today is a " + calendar.DAY_OF_MONTH + " month of the year");
        System.out.println("today is a " + calendar.WEEK_OF_MONTH + " week of the month");

        System.out.println("Current week of month is : " + calendar.get(calendar.WEEK_OF_MONTH));
        System.out.println("Current week of year is : " + calendar.get(calendar.WEEK_OF_YEAR));
        calendar.add(calendar.WEEK_OF_MONTH, 1);
        System.out.println("date after one year : "
                + (calendar.get(Calendar.MONTH) + 1)
                + "-" + calendar.get(Calendar.DATE)
                + "-" + calendar.get(Calendar.YEAR));

    }
}
