package com.company.interfaceenhancement.predicates;

import java.util.ArrayList;

public class PredicateDemoMainJava8 {
    public static void main(String[] a){
       // Predicates<Integer> predicates = (Integer age) -> {return age>18;};
        Predicates<Integer> predicate = age ->  age>18;
        System.out.println(predicate.test(20));

        ArrayList<String> names = new ArrayList<>();

        //predicate<ArrayList> predicate1 = (ArrayList list)-> {return list.isEmpty();};
        //predicate<ArrayList> predicate1 = list-> list.isEmpty();
        //System.out.println(predicate1.test(names));

        names.add("John");
        //System.out.println(predicate.test(names));
    }
}
