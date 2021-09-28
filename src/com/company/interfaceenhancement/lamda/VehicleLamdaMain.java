package com.company.interfaceenhancement.lamda;

public class VehicleLamdaMain {

    public static void main(String[] args){
        Vehicle vehicle = ()->{System.out.println("Vehicle details from lamda");};
        vehicle.details();

        Calculator calculator = (Integer a, Integer b)->{return a+b;};
        //Calculator calculator = (Integer a, Integer b)-> a+b;
       // Calculator calculator1 = a -> a+a; // for single
        Integer result = calculator.add(5,7);
        System.out.println(result);

        //1. Remove modifiers
        //2. Remove Return Type
        //3. Remove Mathod Name
        //4. Add -> sign

        MultiplyInterface multiplyInterface = ()->System.out.println("Im a converted Lamda Function");
        multiplyInterface.multiply();
    }

}
