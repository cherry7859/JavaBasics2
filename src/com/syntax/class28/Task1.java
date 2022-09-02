package com.syntax.class28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /* Create an ArrayList that will store 5 names into it.
            Find out whether the given ArrayList is empty or not?
            Check whether the specific name is present in an ArrayList or not?
            Find the size of your ArrayList and print all values from that
         */

        ArrayList<String> names = new ArrayList<>(5); //always good to specify initial capacity
        names.add("Emre");
        names.add("Selda");
        names.add("Jala Khan");
        names.add("Pti chai");
        names.add("Zameer");
        System.out.println(names.isEmpty()); //false
        System.out.println(names.contains("Cherylle")); //false
        System.out.println(names.size()); //5
        System.out.println(names);
    }
}
