package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zameer");
        names.add("Cherylle");
        names.add("Jazzmin");
        names.add("Ryann");
        System.out.println(names);
        names.remove("Jazzmin"); // remove this element from ArrayList
        System.out.println(names);
        names.remove(2); // remove index 2 element from ArrayList
    }
}
