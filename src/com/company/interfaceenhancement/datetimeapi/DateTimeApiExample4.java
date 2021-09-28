package com.company.interfaceenhancement.datetimeapi;

import java.time.*;

public class DateTimeApiExample4 {
    public static void main(String[] a){

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My current time zone: "+zoneId);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local date and time "+dateTime);

        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");
        System.out.println("My current time zone @ LA: "+LocalDateTime.now(zoneIdLA));

        //System.out.println("My current time zone @ LA: "+ ZonedDateTime.now(zoneIdLA));
        ZoneId zoneIdGMT = ZoneId.of("GMT+05:30");
        System.out.println("My current time zone @ GMT: "+LocalDateTime.now(zoneIdGMT));

        ZoneId zoneIdGMT00 = ZoneId.of("GMT+00:30");
        System.out.println("My current time zone @ GMT 00: "+LocalDateTime.now(zoneIdGMT00));

        System.out.println(Instant.now());//same GMT00
    }
}
