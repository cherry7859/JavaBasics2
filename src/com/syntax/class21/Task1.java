package com.syntax.class21;

public class Task1 {
    /* Create 1 class with a method that will calculate the area(volume in case of box) of
        - Rectangle
        - Square
        -Box
        Use separate class to test
     */

   public static void area(double length, double width){
        System.out.println("Area of rectangle: "+length*width);
    }

   static void area(double side){

       System.out.println("Area of square: "+Math.pow(side,2));
    }

   static void volume(double length, double width, double height){

       System.out.println("Volume of box: "+length*width*height);
    }

    }


