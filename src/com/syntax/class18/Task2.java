package com.syntax.class18;

public class Task2 {
/* Create a method that will take a String as a parameter and returns reversed String.
   Method should be available to all classes within your project and accessible by class name.
 */
    public static String reversedString(String name) { //static keeps us from having to create object b/c variable not needed for future code
        /*StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        String reversedName = stringBuilder.toString();
        return reversedName;*/
        return new StringBuilder(name).reverse().toString(); //While debugging can do Evaluate Expression to see how each part of line works

    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.reversedString("Buddy"));
    }
}

