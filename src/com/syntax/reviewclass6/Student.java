package com.syntax.reviewclass6;

public class Student {

    //define attributes/fields = variables
    String name, lastName, address;

    int studentID, age;

    char grade;

    //define behavior = methods
    void study() {
        System.out.println(name + " is studying");
    }
    void doHomework() {
        System.out.println(name + " is doing homework");
    }

    //create a method that will return full name of a student in uppercase
    String getFullName() {
        return name.toUpperCase()+" "+lastName.toUpperCase();
    }

    //create a method to display full info of a student
    void printInfo() {
        System.out.println(name+" "+lastName+" is "+age+" and lives in "+address);
    }

    /* Create a method that will return whether student is
        great, good, bar or average based on the grade
     */
    String rating() {
        switch (grade) {
            case 'A':
                return "great";
                //If we didn't have return, we would use break;
            case 'B':
                return "good";
            case 'C':
                return "average";
            default:
                return "bad";
        }
    }

    void takeSubject(String subject) { // parameters inside the method
        System.out.println(name+" studies "+subject);
    }
}

