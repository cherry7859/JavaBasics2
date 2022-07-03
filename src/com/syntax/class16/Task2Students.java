package com.syntax.class16;

public class Task2Students {
    /* Task2: Create three variables Name, ID, and numberOfStudents
              Create three objects of the Students Class
              Set the value for studentName, studentID and increment the numberOfStudents for each object
              Print out total number of students
     */

    String name;
    int ID;
    static int numberOfStudents;

    void printTotalStudents() {
        System.out.println("numberOfStudents: "+numberOfStudents);
    }

    public static void main(String[] args) {

        Task2Students student1 = new Task2Students();
        student1.name = "Cherylle";
        student1.ID = 12345;
        numberOfStudents = 1; // If we are inside the same class we can access static variables inside
                             // static methods without having to create an object

        Task2Students student2 = new Task2Students();
        student2.name = "Denaro";
        student2.ID = 67890;
        numberOfStudents = 2;

        Task2Students student3 = new Task2Students();
        student3.name = "Jazzmin";
        student3.ID = 12389;
        numberOfStudents = 3;

        student3.printTotalStudents();
    }
}
