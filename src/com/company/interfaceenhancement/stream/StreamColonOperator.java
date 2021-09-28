package com.company.interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamColonOperator {
    public static void main(String [] args) {
        List<String> alphaNumerics = Arrays.asList("All","A23","a78","344");

        //List<String> strList = alphaNumerics.stream().map(i->i.toUpperCase(Locale.ROOT)).filter(e -> e.startsWith("A")).collect(Collectors.toList());
        //System.out.println(strList);

        //List<String> strList = (List<String>) alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList());
        //System.out.println(strList);

        //filter is a lazy operation on stream
        /*alphaNumerics.stream().filter(input ->
        {
            System.out.println(input);
            return input.startsWith("A");
        }).count();*/

        //alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).forEach(a->System.out.println(a));
        alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).forEach(System.out::println);


    }
}
