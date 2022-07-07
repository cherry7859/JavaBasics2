package com.syntax.class19;

class Animal{ //Use parent class to inherit same variables for all child classes
    String name;
    String breed;
    String color;
    int age;
    double weight;
    void printInfo() { //Can also inherit methods from parent class
        System.out.println("Name: "+name+"; Color: "+color);
    }
}
public class Dog extends Animal{ //Can only have one public class per file
    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

}

class Cat extends Animal{
    Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

}
