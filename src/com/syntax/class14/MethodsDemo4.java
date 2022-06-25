package com.syntax.class14;

public class MethodsDemo4 {

    int sumNumbers (int num1, int num2) { // Can pass multiple values to a method
        return num1 + num2;
    }

    //Write a method that takes a String and an int and print that String on the
    //console as many times as the int value

    void printManyTimes(String str, int times) {
        for(int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        MethodsDemo4 md = new MethodsDemo4();
        System.out.println(md.sumNumbers(10, 10));

        md.printManyTimes("Java", 3);


    }
}
