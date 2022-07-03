package com.syntax.class17;

public class Employee {
    public String name;
    private int salary; // make private b/c sensitive data
    String department;

    private void printSalary() {

        System.out.println("Salary "+salary);
    }
    void printDepartment() {
        System.out.println("Department "+department);
    }
    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Jason";
        emp.department = "IT Department";
        emp.salary = 150000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();
    }
}
