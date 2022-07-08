package com.syntax.class20;

//Multilevel Inheritance

public class GrandParent {
    String name = "Cheryle";
}

class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of my Mother is "+name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Name of my Grandma is "+name);
    }
}
class GrandChild extends Child{
    void printInfo(){
        System.out.println("My great grandmother name is "+name);
    }

    public static void main(String[] args) {
        GrandChild grandchild = new GrandChild();
        grandchild.printInfo();
    }

}
