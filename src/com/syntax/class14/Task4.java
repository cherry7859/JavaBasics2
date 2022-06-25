package com.syntax.class14;

public class Task4 {
    public static void main(String[] args) {

        /* How would you reverse a String work by word? For example
            input ==> This is sentence I want to reverse
            output ==> sihT si ecnetnes I tnaw ot esrever
         */

        String str = "This is sentence I want to reverse";
        String [] arr=str.split(" "); // created array for each word

        for(String s:arr) { // advanced for loop to place all indexes inside variable "s"
            System.out.println(new StringBuilder(s).reverse()+" "); // create StringBuilder
        }
        // new StringBuilder(s): object of StringBuilder is created
        System.out.println();
    }
}
