package com.syntax.class26;

import java.util.ArrayList;

/* Create an Arraylist that will store 5 names into it.
    Find out whether the given ArrayList is empty or not
    Check whether the specific name is present in an ArrayList or not
    Find the size of your ArrayList and print all values from that
 */

public class HW1 {
    public static void main(String[] args) {
        //always good to specify initial capacity
        //it improves the performance
        ArrayList<String> names=new ArrayList<>(5);
        names.add("Emre");
        names.add("Selda");
        names.add("Jala Khan");
        names.add("Pti chai");
        names.add("Zameer");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Zameer"));
        System.out.println(names.size());
        System.out.println(names);

    }

}
