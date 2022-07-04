package com.syntax.class18;

public class Task1 {
    /*Create a method that will accept an array as parameters
        and will return a sum of all elements from that array.
        Method should be visible only within same package and
        accessible by creating an instance of the class
     */

    int sum = 0;
    void method1 (int[] arr) {
        for (int i:arr) {
           sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.method1(new int[]{10, 20, 30, 40, 50});



    }
}
