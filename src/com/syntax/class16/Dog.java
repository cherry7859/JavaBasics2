package com.syntax.class16;

public class Dog {

    //static String name; // if create static, only one memory location declared, so all the dogs' names would be last created variable
    String name;
    String color;


    public static void main(String[] args) {
        Dog dog1 = new Dog(); // creating an object of Dog class
        dog1.name = "Buddy";
        dog1.color = "brown";

        Dog dog2 = new Dog();
        dog2.name = "Fido";
        dog2.color = "black";

        Dog dog3 = new Dog();
        dog3.name = "Buster";
        dog3.color = "white";
    }
}