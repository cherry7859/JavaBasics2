package com.syntax.class18;

public class Task8Student {

    /*Write a Student class that has instance variables "name" and "address".
      Create a constructor that will initialize those variables.
      Print name & address of given student using displayInfo method.
     */

    String name;
    String address;

    Task8Student(String studentName, String studentAddress) {
        name = studentName;
        address = studentAddress;
    }

    void displayInfo() {
        System.out.println("Name: " + name + "; Address: " + address);
    }

    public static void main(String[] args) {
        Task8Student student1 = new Task8Student("Cherylle", "12345 Street St.");
        student1.displayInfo();
    }
}
