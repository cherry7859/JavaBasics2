package com.syntax.class14;

public class MethodsDemo {

    //WHAT: Method is a block of code, a group of java statements that are grouped together and
    //WHY: Save us from repetition
    //HOW:we can execute those statements by creating an object of the class that contains
    // that method abd by writing the objects name .method name

    //Methods can return and take values
    void printHello() { //Does not return a value
        System.out.println("How are you guys");
    }

    boolean returnTrue() { // Will return a boolean value when called
        return true;
    }

    int returnInt() { // Will return 10
        return 10;
    }

    public static void main(String[] args) {
        MethodsDemo md= new MethodsDemo();
        md.printHello();

        boolean xs = md.returnTrue(); // true

        int num = md.returnInt(); // 10
        //OR
        System.out.println(md.returnInt()); // 10; without assigning to a variable


    }
}
