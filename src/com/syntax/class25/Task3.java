package com.syntax.class25;
/*We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters and
    the marks in four subjects as its parameters for student B

 */
public class Task3 {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(96, 92, 87);
        System.out.println(studentA.getAverage());

        StudentB studentB = new StudentB(85, 82, 89, 73);
        System.out.println(studentB.getAverage());
    }
}
abstract class Marks{
    int math;
    int science;
    int history;
    int english;
    abstract double getAverage();
}

class StudentA extends Marks{

    StudentA(int math, int science, int history){
        this.math = math;
        this.science = science;
        this.history = history;

    }

    @Override
    double getAverage() {
        return (math+science+history)/3;
    }
}

class StudentB extends Marks{

    StudentB(int math, int science, int history, int english){
        this.math = math;
        this.science = science;
        this.history = history;
        this.english = english;
    }
    @Override
    double getAverage() {
        return (math+science+history+english)/4;
    }
}
