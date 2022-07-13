package com.syntax.class21;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    public Animal(String name, String color, String breed, int age){
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public Animal(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println("Name: "+name+", Color: "+color+", Breed: "+breed+", Age: "+age);
    }

}
class Dog extends Animal{

    public Dog(String name, String color, String breed, int age) { // need to create matching constructor for at least one of them in parent class
        super(name, color, breed, age); // Call the parent class constructor, to show initializing fields form parent class
    }
}

class Cat extends Animal{
    public Cat(String name, String color, String breed){
        super(name, color, breed);
        System.out.println("Hamid please stop trying, it will not work"); // any other line must come after super following constructor
    }
}
