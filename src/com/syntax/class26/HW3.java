package com.syntax.class26;
import java.util.ArrayList;

//Create an arrayList of words.
//Remove every word that ends with "e".

public class HW3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("game");

        words.removeIf( nat -> nat.endsWith("e"));
    }
}

