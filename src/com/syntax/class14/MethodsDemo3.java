package com.syntax.class14;

public class MethodsDemo3 {

    //Write a method that takes an int value. If that value is even
    // this method returns true, otherwise false

    boolean isEven(int num) {
        if(num%2 == 0) {
            return true;
        } else {
            return false;
            }
        }

    //Write a method that takes a String and returns true if number of characters are even, otherwise odd

    boolean evenCharacters(String str) {
        if(str.length()%2 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        MethodsDemo3 md = new MethodsDemo3();

        System.out.println(md.isEven(24));

        System.out.println(md.evenCharacters("My name is Cherylle"));

    }
    }

