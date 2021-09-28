package com.company.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {

    default void details(){     //By default is available to all implementing classes
        System.out.println("Im a Java 8 default method");
    }
    void mileage();
}
