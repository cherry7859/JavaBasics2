package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}

class Furniture{

    String color = "black";
}
class Chair extends Furniture{
    String color = "grey";
    void printColor(){
        String color = "white";
        System.out.println(color); //"white"; local variable preferred
        System.out.println(this.color);//"grey"; access instance variable
        System.out.println(super.color); //"black"; Super keyword to pull same name variable from parent/super class
    }
}