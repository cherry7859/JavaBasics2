package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Tesla(); //Can store Tesla inside of car but not car inside of Tesla
        car.start(); // will pull output from Tesla Class

        car = new Toyota(); //reassign the "car" value
        car.start(); // will pull output from Car Class b/c Toyota did not Override

        /*BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota = new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/

        Car car2 = new BMW(); // Change the "BMW" Object and all the "cars" will be called from corresponding class
        car2.start();
        car2.stop();
        car2.park();

        //Pulls ouputs from all classes
        Car[] cars = {new BMW(), new Tesla(), new Toyota()};
        for (Car c:cars) {
            c.start();
            c.stop();
            c.park();
        }
    }
}
