package com.syntax.class18;

public class Task3 {
/*Create a method that will accept a String as a parameter and
  return a new String that consists of only vowels.
  Method should be available inside the class only
  where it was declared and executed by calling its name.
 */
    private static String method1(String str) { //Static b/c main method is static and have to be same to call name without creating object

        return str.replaceAll("[^AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(method1("Hello. How are you?"));
    }
}
