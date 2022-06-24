package com.syntax.class17;

public class Teacher {
    String name;
    private int salary;
    public String schoolName;

    public void printInfo() { // b/c print info is public, we can call it in other classes
        System.out.println(name +" "+ salary +" "+ schoolName);
    }
}
