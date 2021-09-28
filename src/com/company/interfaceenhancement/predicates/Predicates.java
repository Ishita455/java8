package com.company.interfaceenhancement.predicates;

@FunctionalInterface
public interface Predicates<T> {

    public boolean test(T t );
}
