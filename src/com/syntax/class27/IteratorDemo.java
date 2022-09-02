package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Bro");
        names.add("Abdul");
        names.add("Cherylle");
        names.add("Zameer");

       // for(String name:names){
       //     names.remove(name); //trying to remove each name one by one in loop
                                //messes up the size of the collection/list, so java doesn't allow

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        }
    }

