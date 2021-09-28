package com.company.interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamFilter {
    public static void main(String [] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        System.out.println(number);
        //output should be multiplied by 3

        List<Integer> output = number.stream().map(input -> input*3).collect(Collectors.toList());
        System.out.println("Output: "+output);
    }
}
