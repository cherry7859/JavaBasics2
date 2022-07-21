package com.syntax.class24;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};

        for(Student st:students){
            st.study();
            st.doHomework();
            st.practice();
            //Prints all of the methods(9)
        }
    }
}
