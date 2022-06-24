package com.syntax.class11;

public class Dog {
    //Attributes/Properties/Fields giving physical characteristics to object
    //Instance variables
    String name;
    int age;
    double weight;
    String color;
    double height;
    String breed;

    //Methods, How object will behave (Behaviors)
    void bark() {
        System.out.println("Dog barks");
    }
    void walks() {
        System.out.println("Dog walks");
    }
    void eat() {
        System.out.println("Dogs like to eat kibble");
    }

    public static void main(String[] args) {

        Dog buddy = new Dog(); // creating an objet and storing in a variable
        buddy.name = "Buddy";
        buddy.age = 6;
        buddy.weight = 16;
        buddy.color = "brown";
        buddy.height = 1.4;
        buddy.breed = "poodle";
        buddy.bark(); // Calls the Method
    }
}
