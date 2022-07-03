package com.syntax.class17;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Jofy", "Russian", "grey", 25, 20);
        dog.printInfo();

        Dog dog2 = new Dog( "Buddy", "Poodle", "golden", 8, 10);
        dog2.printInfo();
    }
}
