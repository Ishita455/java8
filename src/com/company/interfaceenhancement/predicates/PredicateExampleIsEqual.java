package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExampleIsEqual {
    public static void main(String[] a){
        String name = "John";

        Predicate<String> nameEqualityPredicate = Predicate.isEqual("John");
        System.out.println(nameEqualityPredicate.test(name));
    }
}
