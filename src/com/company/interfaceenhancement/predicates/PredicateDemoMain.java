package com.company.interfaceenhancement.predicates;

public class PredicateDemoMain {
    public static void main(String[] a){
        Predicates predicates = new PredicateDemo();
        boolean result = predicates.test(20);
        System.out.println(result);
    }
}
