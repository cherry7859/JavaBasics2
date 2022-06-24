package com.syntax.class16;
import com.syntax.class17.Employee;
public class EmployeeTester {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Merve";
        //employee.salary = 15000; we can't access b/c its private
        //employee.department = "IT"; we can't access
    }

    // Static fields and methods can also be access by just writing the name of the class
}
