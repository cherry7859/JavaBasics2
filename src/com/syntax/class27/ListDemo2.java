package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>(); //recommended, removes the parent class
        legends.add("Hamid");
        legends.add("Marla");
        legends.add("Naveed");
        legends.add("Tara");

        ArrayList<String> moreStudents = new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents = new ArrayList<>();
        allStudents.addAll(legends);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents); //combined both lists into this one
        allStudents.removeAll(legends);
        System.out.println(allStudents); //removed legends list
        allStudents.clear();
        System.out.println(allStudents); //everything removed
    }
}
