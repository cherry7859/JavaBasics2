package com.syntax.class16;

public class Task1SyntaxEmployee {
    /* Task 1: Create 3 variables empID, salary and set the CEO to "Sumair"
                Create two objects of the class SyntaxEmployee
                Set the value of eID, salary for each of the objects
                Print out the eID, salary and CEO for each of the objects
     */

    int empID, salary;
    static String CEO = "Sumair";

    void printEmployeeInfo() {
        System.out.println("empID: "+empID+" salary: "+salary+" CEO: "+CEO);
    }

    public static void main(String[] args) {

        Task1SyntaxEmployee emp1 = new Task1SyntaxEmployee();
        emp1.empID = 12345;
        emp1.salary = 80000;
        emp1.printEmployeeInfo();

        Task1SyntaxEmployee emp2 = new Task1SyntaxEmployee();
        emp2.empID = 67890;
        emp2.salary = 100000;
        emp2.printEmployeeInfo();




    }
}
