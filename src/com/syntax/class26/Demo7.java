package com.syntax.class26;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add(1, "Jira"); // Shifts the following elements 1 index lower

        System.out.println(subjects.indexOf("Java")); //Index of Java: 2
        System.out.println(subjects.size()); // Total number of elements in array: 5
        System.out.println("subjects = " + subjects); //To print out elements of an array or arrayList, type soutv
        System.out.println(subjects.contains("Selenium")); //true
        System.out.println("subjects.get(0) = " + subjects.get(0));


    }
}
