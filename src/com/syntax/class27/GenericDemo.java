package com.syntax.class27;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //names.add(10); Error, can only insert Strings
        //non-generic ArrayList(without diamond operators)
        ArrayList all =  new ArrayList(); // possible, but not good
        all.add(10);
        all.add("Name");
        all.add(10.5);
    }
}
