package com.syntax.class14;

public class Task2 {
    public static void main(String[] args) {

        /*Create a String that should be combination of
            letters, numbers and special characters.
            Find out how many alphanumeric characters
            there are in the string
         */

        String str = "asdfh2984734#$%#$";

        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
    }
}
