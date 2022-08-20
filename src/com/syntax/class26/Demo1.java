package com.syntax.class26;



import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String[] names = {"Aladin", "Reza", "Ahmed"}; // Can store multiple values to variable
        // Use Array List to increase size of Array, and don't have to specify a size
        ArrayList<String> syntaxStudents = new ArrayList<>(); //must use diamond operators "<>" to create ArrayList object
        syntaxStudents.add("Riaz");
        System.out.println(syntaxStudents.size()); // 1
        syntaxStudents.add("Ivan");
        syntaxStudents.add("Cherylle");
        System.out.println(syntaxStudents.size()); // 3

    }

}

class Task {
    // Create ArrayList from num 1-10, and store odd numbers

   // ArrayList <int> number = new ArrayList<>(); //Arraylist cannot store primitive datatypes
   public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>(); // Using integer object type (wrapper class) to use int in ArrayList
    for (int i = 1; i < 10; i = i+2){
        number.add(i);
    }
       System.out.println(number);
}}