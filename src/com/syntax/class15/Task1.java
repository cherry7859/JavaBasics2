package com.syntax.class15;

public class Task1 {
    //Create a method to print the larger of 2 numbers
    void printLarger (int num1, int num2) {
        int larger =0; // local variable b/c present inside method
        if(num1 > num2) {
            larger=num1;
        } else if (num2 > num1) {
            larger = num2;
        } else {
            larger = num1;
        }
        System.out.println(larger);
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.printLarger(12,24);

    }
}
