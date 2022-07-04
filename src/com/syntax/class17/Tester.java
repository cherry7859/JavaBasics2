package com.syntax.class17;

import com.syntax.class16.Dog; // access this class from package class16

import com.syntax.class18.Task2;
public class Tester {
    public static void main(String[] args) {

        Employee employee = new Employee(); //no need for import b/c Employee class exists in same package
        employee.name = "Mike"; // accessible b/c public
        //employee.salary = 125000; // not accessible b/c private. relatable to sensitive data like bank account
        employee.department = "IT department";
        //employee.printSalary(); private so we can't access it
        employee.printDepartment();
        employee.printName();

        Dog dog = new Dog(); // b/c imported from class 16 package, able to be used

        // Class 18, Task2 Test
    Task2 task3 = new Task2();
        System.out.println(task3.reversedString("Cherylle"));


    }
}
