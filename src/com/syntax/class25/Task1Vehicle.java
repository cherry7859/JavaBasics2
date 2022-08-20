package com.syntax.class25;

public class Task1Vehicle {

    int vehiclePrice = 0;

    int calculateSalePrice(){
        return 0;
    }
}

class Sedan extends Task1Vehicle{

}

class Truck extends Task1Vehicle {
    double weight = 0.0;

    @Override
    int calculateSalePrice() {
        if (weight > 2000) {
        }

            return vehiclePrice; // continue from here


    }
}
