package com.company.interfaceenhancement.doublecolonoperator;

public class TwoMain {
    public static void main(String[] args){

        /*ConRefFunInterface conRefFunInterface = ()->{
            Employee e= new Employee();
            return e;
        };*/
        //ConRefFunInterface conRefFunInterface = ()-> new Employee();

        //conRefFunInterface.getEmployee();
        ConRefFunInterface conRefFunInterface2 = Employee::new;
        conRefFunInterface2.getEmployee();
    }
}
