package com.syntax.reviewclass7;

public class B13String {
    //It's best to try to make all instance variables private
    String str;

    public B13String(String str) {
        this.str = str; // "this" referrs to the instance variable
    }

    //Write a method that can tell me how many times as character is being repeated in a string
    public int countChars(char c) {
        int counter = 0;
        for (char cha:str.toCharArray()) {
            if (cha == c) {
                counter++;
            }
        }
        return counter;
    }

    public void printChars(char c){
        int counter=0;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==c){
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter+" times inside this string");
    }
}