package com.syntax.class19;
//Single Inheritance Example
public class Parent {
    String name = "Misha";
    double money = 1000000;

}

class Child extends Parent{ // extends allow us to access all variables from parent class

    void printInfo() {
        System.out.println("My full name is Khrystyna "+name);
    }
    void buyCar(){
        System.out.println("Hehehhe buying car with Papas money "+money);
    }

}
class Tester{
    public static void main(String[] args) {
        Child child = new Child();
        child.printInfo();
    }

}
