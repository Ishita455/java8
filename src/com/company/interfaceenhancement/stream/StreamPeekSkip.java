package com.company.interfaceenhancement.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekSkip {
    public static void main(String[] args) {
        List<String> flats = Arrays.asList("801","D43","A44","A87","B43","B54","B01","B43");
        List<String> flatsWithB = flats.stream().
                filter(flat->flat.startsWith("B")).sorted().peek(System.out::println).distinct().skip(2).collect(Collectors.toList());
        //System.out.println(flatsWithB);

    }
}
