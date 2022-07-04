package com.syntax.class18;

public class Task3 {
/*Create a method that will accept a String as a parameter and
  return a new String that consists of only vowels.
  Method should be available inside the class only
  where it was declared and executed by calling its name.
 */
    String method1(String str) {
        return str.replaceAll("[^AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        Task3 task = new Task3();
        System.out.println(task.method1("Hello. How are you?"));
    }
}
