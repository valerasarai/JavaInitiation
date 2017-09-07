package com.valerastudy.DateTime;

import com.valerastudy.Array.L01_SortAndSearch1;

import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;


public class L02_MonthName {
    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(formatter);

        SimpleDateFormat f1 = new SimpleDateFormat("MMM");
        SimpleDateFormat f2 = new SimpleDateFormat("dd");
        SimpleDateFormat f3 = new SimpleDateFormat("a");
        int h;

        if (Calendar.getInstance().get(Calendar.HOUR) == 0) h = 12;
        else h = Calendar.getInstance().get(Calendar.HOUR);

        String filename = "Current dare is: "
                + f2.format(new Date()) + " "
                + f1.format(new Date()) + " "
                + h  + " " + f3.format(new Date());

        System.out.println(filename);

        Date date = new Date();
        f1.applyPattern("MMMM");
        System.out.println("Current month in \"MMMM\" format 1: " + f1.format(date));

        Format format = new SimpleDateFormat("MMMM");
        String s = format.format(date);
        System.out.println("Current month in \"MMMM\" format 2: " + s);

        String[] s1 = new DateFormatSymbols().getShortMonths();
        L01_SortAndSearch1.printArray("Month", s1);

        s = "dd-MMM-yy";
        date = Calendar.getInstance().getTime();
        f1 = new SimpleDateFormat(s, Locale.FRANCE);
        System.out.println(f1.format(date));
        f1 = new SimpleDateFormat(s, Locale.ENGLISH);
        System.out.println(f1.format(date));

    }

}
