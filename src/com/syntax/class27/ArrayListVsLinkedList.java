package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        //Shows the time difference between picking the right type of list
        List<String> names = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            names.add(0, "Captain Naveed Major");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);// 16

        List<String> names2 = new ArrayList<>();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            names2.add(0, "Captain Naveed Major");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2);// 591
    }
}
