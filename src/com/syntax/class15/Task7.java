package com.syntax.class15;

public class Task7 {
    /*
     * create a method that will return whether student
     * is great, good, bad or average
     * based on the grade
     */
    char grade;
    String rating() {
        switch(grade) {

            case 'A':
                return "great";
            case 'B':
                return "good";
            case 'C':
                return "average";
            default:
                return "bad";
        }
    }

    public static void main(String[] args) {

    }

}

