package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        //Create an ArrayList of cars and retrieve all values using 3 different ways

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Togg");
        cars.add("Audi S5");
        cars.add("Tesla X");
        cars.add("Toyota Gande");

        System.out.println("------SOLUTION 1--------");
        for(String car:cars) {
            System.out.println(car);
        }
        System.out.println("------SOLUTION 2--------");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("------SOLUTION 3--------");
        System.out.println(cars);

        System.out.println("------SOLUTION 4--------");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
