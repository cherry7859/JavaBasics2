package com.syntax.class18;

public class Task2 {
/* Create a method that will take a String as a parameter and returns reversed String.
   Method should be available to all classes within your project and accessible by class name.
 */
    public String reversedString(String name) {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        String reversedName = stringBuilder.toString();
        return reversedName;

    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.reversedString("Buddy"));
    }
}
