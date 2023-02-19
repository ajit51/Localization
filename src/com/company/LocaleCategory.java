package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleCategory {

    public static void print(Locale locale, double money){
        System.out.println(locale.getDisplayLanguage() + ", " + NumberFormat.getCurrencyInstance().format(money));
    }

    public static void main(String[] args) {
        var spain = new Locale("es", "ES");
        var money = 1.23;

        Locale.setDefault(Locale.US);
        print(spain, money);//Spanish, $1.23

        Locale.setDefault(Locale.Category.DISPLAY, spain);
        print(spain, money);//español, $1.23

        Locale.setDefault(Locale.Category.FORMAT, spain);
        print(spain, money);//español, 1,23 €
    }
}
