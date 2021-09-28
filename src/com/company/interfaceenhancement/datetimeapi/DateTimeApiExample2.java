package com.company.interfaceenhancement.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeApiExample2 {
    public static void main(String[] a){
        LocalDate date = LocalDate.now();
        System.out.println("Date after 22 days"+date.plusDays(22));
        System.out.println("Date after 2 months"+date.plusMonths(2));
        System.out.println("Date after 1 yesr"+date.plusYears(1));

        System.out.println("Date before 22 days"+date.minusDays(22));
        System.out.println("Date before 2 months"+date.minusMonths(2));
        System.out.println("Date before 1 yesr"+date.minusYears(1));


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("Date after 20 days"+dateTime.plusDays(20));
    }
}
