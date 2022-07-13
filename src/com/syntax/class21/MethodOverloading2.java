package com.syntax.class21;

public class MethodOverloading2 {
    static void add(int number1, int number2){
        System.out.println(number1+number2);
    }
//Can use same name for methods if similar functions with diff number of parameters or datatypes
    static void add(double number1, double number2){
        System.out.println(number1+number2);
    }

    static void add(double number1, double number2, double number3){
        System.out.println(number1+number2+number3);
    }

    static void add(int number1, int number2, int number3, int number4){
        System.out.println(number1+number2+number3+number4);
    }

    public static void main(String[] args) {
        add(20,20);

    }
}
