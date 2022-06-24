package com.syntax.class18;

public class CarTester {
    public static void main(String[] args) {
      Car car1 = new Car("Audi","Etron GT","Black");
      car1.printInfo();
      Car car2 = new Car("Toyota","Camry","White");
      car2.printInfo();

      Car car = new Car();// End user able to create object without parameters b/c default constructor in Car Class

        Car car3 = new Car("Tesla"); // end user creating object from the constructor asking for car model
        car.printCarModel();
    }
}
