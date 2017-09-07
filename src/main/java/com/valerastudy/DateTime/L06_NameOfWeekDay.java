package com.valerastudy.DateTime;

import com.valerastudy.Array.L01_SortAndSearch1;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class L06_NameOfWeekDay {
    public static void main(String[] args) {
        String weekdays[] = new DateFormatSymbols(Locale.FRANCE).getWeekdays();
        L01_SortAndSearch1.printArray("Weekdays", weekdays);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.US);
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
