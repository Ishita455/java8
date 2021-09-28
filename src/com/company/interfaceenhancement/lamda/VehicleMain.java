package com.company.interfaceenhancement.lamda;

public class VehicleMain {

    public static void main(String[] args){
        System.out.println("Main Method");
        VehicleImpl vehicleImpl = new VehicleImpl();
        vehicleImpl.details();

        Vehicle vehicle = new VehicleImpl();
        vehicle.details();
    }
}
