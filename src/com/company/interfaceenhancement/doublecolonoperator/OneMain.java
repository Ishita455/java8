package com.company.interfaceenhancement.doublecolonoperator;

public class OneMain {

    public static void main(String [] args){

        //Employee employee = new Employee();

        /*LamdaOne lamdaOne = ()-> System.out.println("From Lamda one");
        lamdaOne.show();

        Employee employee = new Employee();

        LamdaOne lamdaOne1 = employee :: details;
        lamdaOne1.show();*/

       /* LamdaTwo lamdaTwo = employee :: details2;
        lamdaTwo.show2(55); */

        LamdaTwo lamdaTwoStatic = Employee :: detailsStatic;
        lamdaTwoStatic.show2(70);
    }
}
