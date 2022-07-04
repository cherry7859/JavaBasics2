package com.syntax.class18;

import javafx.concurrent.Task;

public class Task5Students {

    /*Write a java Class Students that have a constructor which takes students
      name and 3 subject grades. Inside your class also have a method to
      Calculate Average Grade. Test Student class for 5 different students
      with different marks. Your program should print an average mark of each students' name.
     */

    String name;
    int grade1;
    int grade2;
    int grade3;

    Task5Students(String stuName, int stuGrade1, int stuGrade2, int stuGrade3) {
        name = stuName;
        grade1 = stuGrade1;
        grade2 = stuGrade2;
        grade3 = stuGrade3;
    }

    void avgGrade() {
        System.out.print(name+": ");
        System.out.println((grade1+grade2+grade3)/3);
    }

    public static void main(String[] args) {
        Task5Students student1 = new Task5Students("Jason", 95, 90, 89);
        student1.avgGrade();

        Task5Students student2 = new Task5Students("Mike", 73, 69, 67);
        student2.avgGrade();

        Task5Students student3 = new Task5Students("Tristan", 85, 70, 79);
        student3.avgGrade();

        Task5Students student4 = new Task5Students("Mykaela", 99, 94, 98);
        student4.avgGrade();

        Task5Students student5 = new Task5Students("Amber", 82, 88, 83);
        student5.avgGrade();

        }
    }




