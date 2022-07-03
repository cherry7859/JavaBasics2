package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int noOfEmployees;
    static String companyName = "Google";

    void displayEmployeeInfo() { //b/c void method, cannot return something...
        System.out.println("Name "+name+" Salary "+salary+" Company Name "+companyName+" Total Employees "+noOfEmployees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1 = new GoogleEmployees();
        emp1.name = "Oleg";
        emp1.salary = 250000;
        emp1.noOfEmployees = 1;

        GoogleEmployees emp2 = new GoogleEmployees();
        emp2.name = "Cherylle";
        emp2.salary = 2500000;
        emp1.noOfEmployees = 2; // static b/c even though variable changes, applies to all the objects/employees
        emp1.displayEmployeeInfo(); //... so can't print out, just recall. But prints b/c method prints
        emp2.displayEmployeeInfo();
    }
}
