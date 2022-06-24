package com.syntax.class18;

public class Car {

   private String make; // private variables so one can edit the values
   private String model;
   private String color;

   public Car(){ // default constructor allows end user to create object in different ways

   }
    public Car(String carMake,String carModel,String carColor){ // public constructor so we can access in other classes
        make = carMake;
        model = carModel;
        color = carColor;
    }

    public Car(String carModel){ //constructor that only requires user to input the model
       model=carModel;
    }
    void printCarModel(){
        System.out.println("Model "+model);
    }

    void printInfo(){
        System.out.println("Make "+make+" Model "+model+" Color "+color);
    }

}
