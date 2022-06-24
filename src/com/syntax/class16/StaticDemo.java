package com.syntax.class16;

public class StaticDemo {

    static int noOfEmployees = 10;
    String name; // cannot access instance variable inside static method

    static void method1(){

        System.out.println(noOfEmployees);
        // System.out.println(name); // Cannot print non-static value inside a static method
    }

    void method2(){
        System.out.println(noOfEmployees);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        st.name = "Omid";

        StaticDemo st2 = new StaticDemo();
        st2.name = "Rachid";
    }
}
