package com.syntax.class12;

public class Task1 {
    public static void main(String[] args) {

        /*Create Username, Password, and ConfirmPassword. Password Must:
            1)at least 8 characters
            2)cannot contain username
            3)must match
         */

        String userName="admin";
        String password="Password1234";
        String confirmPassword="Password1234";
        if(userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if(password.length()<8) {
            System.out.println("Password is too short");
        }else if(password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if(!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }


    }
}
