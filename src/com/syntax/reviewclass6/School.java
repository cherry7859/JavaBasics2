package com.syntax.reviewclass6;

public class School {
    public static void main(String[] args) {
       Student student1 = new Student(); // Student1 can access all the variables from Student Class

       student1.name = "Cherylle";
       student1.lastName = "Finley";
       student1.address = "Texas";
       student1.studentID = 101;
       student1.age = 24;
       student1.grade = 'A';

       student1.study();
       student1.doHomework();
       String fullName = student1.getFullName();
        System.out.println(fullName);

        student1.printInfo();

        String rating = student1.rating();
        System.out.println(student1.name+" is a "+rating+" student");

        student1.takeSubject("Java");

       Student student2 = new Student();
       //accessing variables of Student class
        student2.name = "Denaro";
        student2.lastName = "McKenzie";
        student2.address = "Houston";
        student2.studentID = 102;
        student2.age = 33;
        student2.grade = 'B';
        //accessing methods of Student class
        student2.study();
        student2.doHomework();
       String fullName2 = student2.getFullName();
        System.out.println(fullName2);

        student2.printInfo();

        student2.takeSubject("Biology"); // calling the method, with the argument to match the parameters


    }
}
