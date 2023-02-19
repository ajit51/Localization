package com.company;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        //now
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        //off
        LocalDate date1 = LocalDate.of(2023, Month.FEBRUARY, 18);
        LocalDate date2 = LocalDate.of(2023, 2, 18);

        LocalTime time1 = LocalTime.of(19, 23);
        LocalTime time2  = LocalTime.of(19, 23, 59);
        LocalTime time3  = LocalTime.of(19, 23, 59, 808);

        var ldt1 = LocalDateTime.of(2023, Month.FEBRUARY, 18, 19,23,59);
        var ldt2 = LocalDateTime.of(date1, time1);

        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        System.out.println(date1.now().getDayOfMonth());


    }
}
