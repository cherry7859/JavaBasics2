package com.syntax.class14;

public class Recap {
    public static void main(String[] args) {

        String str = "I never forget about recording";
        //METHOD CHAINING
        System.out.println(str.replace("never", "always").replace("I", "Asghar"));

        str = "dsagoiajeiorgiojrs3457987#$G%G$G%^$F3343356";
        System.out.println(str.replaceAll("[0-9]", "")); // removes all numbers

        String str2 = "Batch 13 is great. Batch 13 is best. Batch13 is excellent";
        String [] arr = str2.split("[.]"); // Breaks String down into arrays, based on the "."s
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        str = "WE #love# Java";
        String [] arr2 = str.split("[#]"); // Splits the String based on "#"s
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
