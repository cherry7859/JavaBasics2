package com.syntax.class17;

public class IntelliJFeatures2 {
    public static void main(String[] args) {
        boolean flag = true;

        if(!flag) { // hovered and simplified the condition from (!flag == true)
            System.out.println("This can be simplified. I am writing complex code");
        } else {
            System.out.println("IntelliJ will help");
        }
    }
}
