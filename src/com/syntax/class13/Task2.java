package com.syntax.class13;

public class Task2 {
    public static void main(String[] args) {

        //Create a String and print it in reverse order (Sunday -> yadnuS)

        String str = "Sunday";
        for(int i = str.length()-1; i>=0; i--) { // Reverse loop to start from end
            System.out.println(str.charAt(i));
        }
    }
}
