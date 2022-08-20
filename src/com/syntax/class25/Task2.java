package com.syntax.class25;
/* Create an interface 'Shape' with undefined methods as
    'CalculateArea' and 'CalculatePerimeter'. Create 2 classes
    'Circle' and 'Square' that implements functionality defined in the Shape Interface
 */

public class Task2 {
}

interface Shape{
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Calculate the area of a circle");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculate the perimeter of a circle");
    }
}

class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Calculate the area of a square");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculate the perimeter of a square");
    }
}
