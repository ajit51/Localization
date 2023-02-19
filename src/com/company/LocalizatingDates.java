package com.company;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizatingDates {

    private static void print(DateTimeFormatter dtf, LocalDateTime localDateTime, Locale locale) {
        System.out.println(dtf.format(localDateTime) + ", " + dtf.withLocale(locale).format(localDateTime));
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2023, Month.FEBRUARY, 19, 12, 23, 55);

        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), dt, italy);
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT), dt, italy);
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT), dt, italy);
    }
}
