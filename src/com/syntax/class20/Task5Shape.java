package com.syntax.class20;
/*Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
    In circle class create a method to calculate the area of circle*/

public class Task5Shape {
    double radius;
    Task5Shape(double radius){
        this.radius = radius;
    }
}
class Circle extends Task5Shape{
    Circle(double radius){
        super(radius);
    }
    void calculateAndPrintArea(){
        double area = Math.PI*Math.pow(radius,2); //use the constants to help with the math equation
        System.out.println("Area: "+area);
    }

    }
class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.calculateAndPrintArea();
    }
}