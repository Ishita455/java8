package com.company.interfaceenhancement.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {
    public static void main(String [] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        System.out.println(number);

        List<Integer> oddNumber = new ArrayList<>();

      for (Integer num: number){
          if(num%2 !=0){
              oddNumber.add(num);
          }
      }
        System.out.println(oddNumber);

     //Stream<Integer> stream = number.stream();
       //oddNumber = number.stream().filter(num -> num % 2 != 0).collect(collectors.toList());
        Predicate<Integer> oddEvenPredicate = num -> num % 2 != 0;
       // oddNumber = number.stream().filter(oddEvenPredicate).collect(collectors.toList());
       System.out.println("Odd numbers using Java8 String "+oddNumber);
    }
}
