package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //we can store the object of a class inside a variable of type parent class
        // OR interface if that class implements that interface
        List<String> legends = new ArrayList<>();
        legends.add("Hamid");
        legends.add("Marla");
        legends.add("Naveed");
        legends.add("Tara");
        System.out.println(legends.size()); //1
        System.out.println(legends.isEmpty()); //false
        //contains is an abstract methods because inside list interface. Can put any datatype
        System.out.println(legends.contains("Burham")); //false
        //returns an array containing all elements in sequential order
        Object [] arr = legends.toArray();
        System.out.println(arr[0]); // Hamid
        System.out.println(legends);
        legends.remove("Hamid");
        System.out.println(legends);

        List<String> hardworkingStudents = new ArrayList<>();
        hardworkingStudents.add("Cherylle");
        hardworkingStudents.add("Adbul");
        hardworkingStudents.add("Hamid");
        //check if ALL the elements are present in the other list (sublist/subset)
        System.out.println(hardworkingStudents.containsAll(legends)); // false


    }
}
