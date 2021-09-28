package com.company.interfaceenhancement.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeApiExample3 {
    public static void main(String[] a){

        //get the total experience of an employee in years
        LocalDate todayDate =LocalDate.now();
        LocalDate startDate =LocalDate.of(2012,07,13);

        //years of experience
        Period period = Period.between(startDate,todayDate);//startDate is inclusive & other exclusive
        System.out.println("years of Experience is :"+period.getYears());

        System.out.printf("Total Experience is %d years, %d months, %d days ",period.getYears(),period.getMonths(),period.getDays());

    }
}
