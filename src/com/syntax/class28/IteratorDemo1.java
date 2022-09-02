package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");
//Never use loops to change size of a list
        /* for(String word:words){
            if(word.endsWith("e")){
                words.remove(word);


        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
            }
        }
        System.out.println(words); */

      /*  Iterator<String> iterator = words.iterator();
        System.out.println(iterator.hasNext());//starts at -1 and tells us if there are more elements
        System.out.println(iterator.next()); // start s at -1 and tells us the next element
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next()); */

       /* while (iterator.hasNext()){
            if(iterator.next().endsWith("e")){
                iterator.remove(); */

        words.removeIf(nat -> nat.endsWith("e")); //Best way
        System.out.println(words);
    }
}

