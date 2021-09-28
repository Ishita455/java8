package com.company.interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {
    public void show(); //1 abstract method
    public default void details(){

    }
    public default void details2(){ //More than 1 default method

    }
    public static String enquire(){   //More than 1 static method
        return "Function Interface";
    }
    public static String enquire2(){
        return "Function Interface";
    }
}
