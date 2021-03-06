package com.company.interfaceenhancement.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] a){
        List<Integer> numList = Arrays.asList(11,2,33,44,55,66,77);
        System.out.println("numlist: "+numList);

        List<Integer> numListNew = numList.stream().map(x->x).collect(Collectors.toList());
        System.out.println("NumListNew :"+numListNew);

        List numListNew3 = numList.stream().map(x->Arrays.asList(x,x+1)).collect(Collectors.toList());
        System.out.println("NumListNew3 :"+numListNew3);

        List numLastListNew4 = numList.stream().flatMap(x-> Stream.of(x,x+1)).collect(Collectors.toList());
        System.out.println("numLastListNew4 :"+numLastListNew4);

        List newFlatList = numList.stream().flatMap(x->{
            if(x%2 !=0){
                return Stream.empty();
            }else {
                return Stream.of(x,x*2,x*3);
            }
        }).collect(Collectors.toList());

        System.out.println("newFlatList: "+newFlatList);
    }
}
