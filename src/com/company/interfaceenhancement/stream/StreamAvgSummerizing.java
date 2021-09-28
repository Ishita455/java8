package com.company.interfaceenhancement.stream;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummerizing {
    public static void main(String[] args){

        Set<Integer> numSet = new HashSet<>();
        numSet.add(11);
        numSet.add(12);
        numSet.add(13);
        numSet.add(14);

        Double avg = numSet.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(avg);

        IntSummaryStatistics summery = numSet.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(summery);
        System.out.println(summery.getAverage());

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(11);
        numSet2.add(12);
        numSet2.add(13);
        numSet2.add(14);

        IntSummaryStatistics summery2 = numSet2.stream().collect(Collectors.summarizingInt(x->x));
        summery.combine(summery2);
        System.out.println(summery);

    }
}
