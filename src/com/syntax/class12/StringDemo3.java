package com.syntax.class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String str = "1234897123424";

        int counter = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') { // acknowledges the number of times '1' is present in String
                counter++; //  adds to the counter each time
            }
        }
        System.out.println(counter); // 2: prints, final result of counter
    }
}
