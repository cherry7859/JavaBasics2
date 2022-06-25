package com.syntax.class14;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String s = new String("hahhahaha");
        System.out.println(s.toUpperCase());
        StringBuilder st = new StringBuilder("jajajja");
        System.out.println(st.reverse());
        //String and StringBuilder are both classes we can use to store and manipulate characters
        //String is immutable and StringBuilder is mutable
        //When we make a lot of changes to a String it creates multiple copies inside your memory and can be very slow
    }
}
