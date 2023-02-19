package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalingNumbers {
    public static void main(String[] args) throws ParseException {
        //formatting numbers
        int attendiesPerYear = 3_200_000;
        int attendiesPerMonth = attendiesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendiesPerMonth));//266,666

        var gr = NumberFormat.getInstance(Locale.GERMAN);
        System.out.println(gr.format(attendiesPerMonth));//266,666

        var cf = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(cf.format(attendiesPerMonth));//266,666

        //currency
        Locale.setDefault(new Locale("en", "GB"));
        double price = 40;
        var myLocal = NumberFormat.getCurrencyInstance();
        System.out.println(myLocal.format(price));//£40.00

        //parsing (String to Number)
        Locale.setDefault(new Locale("en", "US"));
        ;
        String str = "40.45";
        var en = NumberFormat.getInstance();
        System.out.println(en.parse(str));

        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(str));

        //currency
        String income = "$92,807.99";
        var cf1 = NumberFormat.getCurrencyInstance();
        double value = (double) cf1.parse(income);
        System.out.println(value);

        //custom formatter number
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));//1,234,567.5

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));//001,234,567.46700

        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d));//$1,234,567.47


    }
}
