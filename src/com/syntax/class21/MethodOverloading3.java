package com.syntax.class21;

import jdk.internal.org.objectweb.asm.commons.Method;

public class MethodOverloading3 {
    void method() {
        System.out.println("2");
    }

    void method(String name, int num) {
        System.out.println("2");
    }

    void method(int num) {
        System.out.println("3");
    }

    void method(int num, String name) {
        System.out.println("4");
    }

//All of these work because follow the rules for Method Overloading

    public static void main(String[] args) {
        MethodOverloading3 m = new MethodOverloading3();
        m.method(20); // 3
    }
}