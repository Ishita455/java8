package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] a) {
        Integer[] numbers = {2, 6, 9, 4, 8, 17, 32};
        Predicate<Integer> oddEvenPredicate = num -> num % 2 != 0;
        for (Integer num : numbers) {
            if (oddEvenPredicate.test(num)) {
                System.out.println("Odd Number" + num);
            }
            if (oddEvenPredicate.negate().test(num)) {
                System.out.println("Even Number" + num);
            }
        }
        //find all the odd num which r greater than 10
        Predicate<Integer> gt10Predicate = num -> num > 10;
        for (Integer num : numbers) {
            if (gt10Predicate.and(oddEvenPredicate).test(num)) {
                System.out.println("Odd Number>10 " + num);
            }
            //Array of names with some empty string also in array remove all empty string
            //System.out.println(isOdd.test(4));
        }
    }
}
