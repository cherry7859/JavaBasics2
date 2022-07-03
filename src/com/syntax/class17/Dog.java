package com.syntax.class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) { // giving parameters to Constructor
        name = dogName; // parameter values will be assigned to the instances
        breed = dogBreed;
        color = dogColor;
        if (dogAge > 0 && dogAge < 25) { // can have more control over values by writing if statements
            age = dogAge;
        } else {
            System.out.println("Dog age can't be greater than 24");
        }
        weight = dogWeight;
    }

    void printInfo() {
        System.out.println("Name: " + name + " Breed: " + breed + " Color: " + color + " Age: " + age + " Weight: " + weight);
    }

    public static void main(String[] args) {
       /* Dog dog1 = new Dog();
        dog1.name = "Lofy";
        dog1.breed = "German";
        dog1.color = "black";
        dog1.age = 15;
        dog1.weight = 20;
        dog1.printInfo();

        Dog dog2 = new Dog();
        dog2.name = "Gofu";
        dog2.breed = "American";
        dog2.color = "pink";
        dog2.age = 15;
        dog2.weight = 20;
        dog2.printInfo();
        */
    }
}
