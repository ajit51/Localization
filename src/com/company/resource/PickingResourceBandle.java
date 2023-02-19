package com.company.resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class PickingResourceBandle {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));//default local
        Locale locale = new Locale("fr", "FR");//requested local

        var rb = ResourceBundle.getBundle("Zoo");
        //System.out.println(rb.getString("name"));
        /**
         * Zoo_en_US
         * Zoo_en
         * Zoo
         *
         * */
        var rb1 = ResourceBundle.getBundle("Zoo", locale);
        //System.out.println(rb1.getString("name"));
        /**
         * Zoo_fr_FR
         * Zoo_fr
         * Zoo
         *
         * if requested locale (language, country) not present
         *  Zoo_en_US
         *  Zoo_en
         *  Zoo
         * */

        var rb2 = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(rb2.getString("hello"));
        System.out.print(".");
        System.out.print(rb2.getString("text"));
        System.out.print(" ");
        System.out.print(rb2.getString("open"));
        System.out.print(" ");
        System.out.print(rb2.getString("visitors"));

    }
}
