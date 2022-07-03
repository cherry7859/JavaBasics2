package com.syntax.class15;

public class Task3 {
    //Create a method that will print whether given String is palindrome

    void printIsPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str); // convert the String into StringBuilder
        stringBuilder.reverse(); // Reverse the String(Builder)
        String reversedStr = stringBuilder.toString(); // convert the reversed String(Builder) back into a String
        if (str.equals(reversedStr)) { // Checks condition if the String is same forwards and backwards
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.printIsPalindrome("dad");
        task3.printIsPalindrome("Aladin");
    }
}
