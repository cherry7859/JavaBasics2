package com.syntax.class26;

import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
            Integer number = 10; //could convert this non-primitive datatype into long, byte, String, etc.
        int number1 = 15;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(number1); // int automatically converted into Integer class (autoboxing)
        System.out.println("numbers = " + numbers);

        int number3 = numbers.get(0); // auto unboxing from Integer to int
    }
}
