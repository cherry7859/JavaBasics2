package com.syntax.class23;

//public final class Animal { // final keyword keeps other classes from being able to inherit
public class Animal{

    Animal(){
        System.out.println("Parent");
    }
    //final void eat(){ // final keyword keeps other classes from inheriting method
    void eat(){
        System.out.println("All the animals eat");
    }
}
class Panda extends Animal{

    Panda(){
        System.out.println("Child");
    }
    void eat(){
        System.out.println("All the animals eat");
    }
}

class Tester{
    public static void main(String[] args) {
        new Panda(); //When create object of child class, all objects above it in hierarchy are created first
    }
}