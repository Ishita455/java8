package com.company.interfaceenhancement.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static  void main(String[] args){
        List<Integer> numList = Arrays.asList(55,33,57,88,101);
        List<Integer> duplicateNumList = Arrays.asList(55,33,57,88,101,55,33,57,88,101);

        // Integer minVal =  numList.stream().min((a,b)->{ return a.compareTo(b); }).get();
        //Integer maxVal =  numList.stream().max((a,b)->{ return a.compareTo(b); }).get();

        Integer minVal =  numList.stream().min(StreamMinMax::sortElement).get();
        Integer maxVal =  numList.stream().max(StreamMinMax::sortElement).get();

        System.out.println("Min Value: "+minVal+" Max Value: "+maxVal);

        List<Integer> dupeSortedList = duplicateNumList.stream().sorted().collect(Collectors.toList());
        System.out.println("dupsortedList "+dupeSortedList);

        List<Integer> distinctSortedList = duplicateNumList.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctsortedList "+distinctSortedList);

    }

    public static Integer sortElement(Integer a, Integer b){
        return a.compareTo(b);
    }
}
