package com.company;

import java.util.Locale;

public class MyLocal {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);//en_US

        //select Locale
        //1 create local using constant
        System.out.println(Locale.GERMAN);//de
        System.out.println(Locale.GERMANY);//de_DE

        //2
        // create local using Constractor
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("ur", "PK"));//ur_PK
        System.out.println(new Locale("xx", "XX"));//xx_XX

        //3
        //// create local using Builder
        Locale l1 = new Locale.Builder()
                .setLanguage("hi")
                .setRegion("IN")
                .build();
        System.out.println(l1);//hi_IN

        Locale l2 = new Locale.Builder()
                .setRegion("IN")
                .setLanguage("hi")
                .build();
        System.out.println(l2);//hi_IN

        //set locale
        Locale locale1 = Locale.getDefault();
        System.out.println(locale1);//en_US

        Locale locale2 = new Locale("fr");
        System.out.println(locale2);//fr

    }
}
