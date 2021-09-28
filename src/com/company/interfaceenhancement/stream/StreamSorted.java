package com.company.interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(16);
        number.add(25);
        number.add(34);
        number.add(46);
        number.add(52);
        number.add(68);
        //normal inseretion order
        System.out.println(number);

        //custom sort
        System.out.println(number.stream().sorted((elem1,elem2)->elem1.compareTo(elem2)).collect(Collectors.toList()));

        //custom sort descending sort
        System.out.println(number.stream().sorted((elem1,elem2)->elem2.compareTo(elem1)).collect(Collectors.toList()));

        //custom sort
        System.out.println(number.stream().sorted((elem1,elem2)-> -elem1.compareTo(elem2)).collect(Collectors.toList()));

        //ascending order
        System.out.println(number.stream().sorted().collect(Collectors.toList()));
    }
}
