package com.company.interfaceenhancement.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

    public static void main(String[] args){

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
        //Sequencial Stream - it follows order & runs items in stream in a sequence, it is slow in processing
        //Parallel stream - Runs in multiple threads , do not follow order , faster in processing

        intList.stream().forEach(System.out::println);
        System.out.println("***************************");
        //intList.stream().parallel().forEach(System.out::println);

        intList.parallelStream().forEach(System.out::println);
    }
}
