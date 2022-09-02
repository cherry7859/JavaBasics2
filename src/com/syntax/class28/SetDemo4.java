package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo4 {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("orange"); //will only see orange once b/c a set

        System.out.println(fruit);
        System.out.println("------------------------------");
        Iterator<String> iterator = fruit.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //really only needed when changing the set
        }
        System.out.println("-----------------------------");
        for(String frt:fruit){
            System.out.println(frt); //easy way to print all elements in set
        }
    }
}
