package com.syntax.class18;

public class CowTester {
    public static void main(String[] args) {
        Cow cow = new Cow("Australian", "Black",28,200);
        System.out.println(cow.getCowInfo());
        //Variables return null because instance variable have same name as local variables,
        // and instance variable were never accessed
    }
}
