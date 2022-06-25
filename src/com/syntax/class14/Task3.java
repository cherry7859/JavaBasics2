package com.syntax.class14;

public class Task3 {
    public static void main(String[] args) {

        /* You have a String a= "Is it Saturday? Is it raining? Do we have a Java Class today?";
            How would you find out how many sentences are in that String?
         */

        String str = "Is it Saturday? Is it raining? Do we have a Java Class today? I love Java. We go to park today!";
        System.out.println(str.split("[?.!]").length); // Can combine expressions in one
    }
}
