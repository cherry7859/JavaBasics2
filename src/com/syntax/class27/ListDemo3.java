package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>(); //recommended, removes the parent class
        legends.add("Hamid");
        legends.add("Marla");
        legends.add("Naveed");
        legends.add("Naveed");
        legends.add("Tara");
        System.out.println(legends.get(3)); //Naveed
        System.out.println(legends);

        legends.set(0, "Hamid Jan");//replaces specified index
        System.out.println(legends);
        System.out.println(legends.indexOf("Tara")); //4
        System.out.println(legends.lastIndexOf("Naveed")); //3

        System.out.println(legends.subList(0,3)); //print only index 0-2
    }
}
