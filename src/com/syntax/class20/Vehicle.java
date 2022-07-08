package com.syntax.class20;
//Multilevel Inheritance Example
public class Vehicle {
    int engineHP;
    String make;
    String model;
    String color;
}
class Car extends Vehicle{
    String steeringType;
    boolean autoPilot;
    int noOfWindows;
}
class BMW extends Car{
    int topSpeed;
    void printBasicInfo(){
        engineHP = 500;
        System.out.println(engineHP);
    }
}
