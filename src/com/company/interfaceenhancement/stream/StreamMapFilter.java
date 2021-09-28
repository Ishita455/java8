package com.company.interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {

    public static void main(String [] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("kiwi");
        fruits.add("Banana");

        //Print lenght of every fruit
        System.out.println(fruits.stream().map(f -> f.length()).collect(Collectors.toList()));

        //find those fruits length is greater than 5
        System.out.println(fruits.stream().map(f -> f.length() > 5).collect(Collectors.toList()));

        //find fruit whose lenth is greater 5
        System.out.println(fruits.stream().map(f -> f.length()>5).collect(Collectors.toList()));

        //how many fruits exist that have length greater than 5
        Long numOfFruitsLengthGrt5 = fruits.stream().filter(f ->f.length()>5).count();
        System.out.println(numOfFruitsLengthGrt5);
    }
}
