package com.company.interfaceenhancement.doublecolonoperator;

public class Employee {

    public Employee(){
        System.out.println("Default Constructor");
    }

    public void details(){
        System.out.println("Showing employee details");
    }

    public void details2(int number){
        System.out.println("employee details two with one para: "+number);
    }

    public static void detailsStatic(int number){
        System.out.println("employee detailsStatic with one para: "+number);
    }
}
