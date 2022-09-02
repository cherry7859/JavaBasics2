package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange"); //will only see orange once b/c a set

        System.out.println(fruit); //order of elements is maintained
    }
}
