package com.syntax.class20;

public class Task2 {
    //Write program to inherit class A that has method printF which is static and
    //call or reuse that method into class B
}
class Base{
        static void printF(){
                System.out.println("Cherylle");
        }
}
class Derived extends Base{
        public static void main(String[] args) {
                printF();
        }
}
//Single Inheritance