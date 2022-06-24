package com.syntax.reviewclass7;

public class Demo1 {
    public static void main(String[] args) {
        char [] arr = {'a', 'b', 'c',};
        String str = new String(arr);
        System.out.println(str); // Used a constructor to create an array of characters. = abc

        int [] arr2 = {65, 66, 67, 68, 69};
        String str2 = new String(arr2, 0, 3);
        System.out.println(str2); // Constructor used to convert numbers to String = ABC. Used ASCII table for number conversions

        String name = "Cherylle Finley McKenzie";
        if(name.length()>10) { //checks length of String and returns the value
            System.out.println("Please use shorter name");
        }else{
            System.out.println("Your name has been accepted");
        }
    }
}
