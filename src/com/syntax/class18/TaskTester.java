package com.syntax.class18;

public class TaskTester {
    public static void main(String[] args) {

        //Task2 Test
        Task2 task3 = new Task2();
        System.out.println(task3.reversedString("Denaro"));

        //Task4 Test
        Task4 task1 = new Task4();

        Task4 task2 = new Task4( "Mike", 53, 180);

        //Task6 Test
        Task6 object1 = new Task6(); // Public
        //Task6 object2 = new Task6("Abigail"); // Private
        Task6 object3 = new Task6(65); // Default
        Task6 object4 = new Task6(165.8); // Protected



    }
}