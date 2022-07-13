package com.syntax.class20;

public class BirdTester {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Parrot", "black", 10, .5);
        parrot.printInfo();

        Sparrow sparrow = new Sparrow("Jack Sparrow", "white", 7, .4);
        sparrow.printInfo();
    }
}
