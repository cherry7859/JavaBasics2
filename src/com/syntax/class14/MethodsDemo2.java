package com.syntax.class14;

public class MethodsDemo2 {

    //Write a method when called it should print 5 times Batch 13 is great

    void print() {
        for (int i = 0; i < 5; i++) { //Creates the 5x iteration
            System.out.println("Cherylle is great");
        }
    }

        void printManyTimes ( int times){ // Allows us to change the value for "times" variable
            for (int i = 0; i < times; i++) { //Creates the 5x iteration
                System.out.println("Cherylle is amazing");
            }
        }

        public static void main (String[]args){

            MethodsDemo2 md = new MethodsDemo2();
            md.print();
            md.printManyTimes(3); // Here we input the value for "times" variable
        }

}
