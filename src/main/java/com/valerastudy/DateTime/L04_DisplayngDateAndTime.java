package com.valerastudy.DateTime;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class L04_DisplayngDateAndTime {

    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println(formatter);

        Date date = new Date();
        System.out.println(date.toString());

        // different Country fotmat

        Locale localeItaliano = new Locale("it", "ch");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaliano);
        System.out.println(dateFormat.format(date));

        localeItaliano = new Locale("ro");
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaliano);
        System.out.println(dateFormat.format(date));

    }
}
