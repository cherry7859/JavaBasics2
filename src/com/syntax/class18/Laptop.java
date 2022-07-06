package com.syntax.class18;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop() {
        System.out.println("Basic construction is happening...");
    }
    public Laptop(String make) {
        this.make = make;
    }

    public Laptop(String make, String model){
       // this.make = make;
        this(make);
        this.model = model;
    }

    public Laptop(String make, String model, String storage) {
        /*this.make = make;
        this.model = model;*/
        this(make, model);
        this.storage = storage;
    }

    public Laptop(String make, String model, String storage, String memory) {
        /*this.make = make;
        this.model = model;
        this.storage = storage;*/
        this(make, model, storage);
        this.memory = memory;
    }

    public Laptop(String make, String model, String storage, String memory, double screenSize) {
        /*this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(make, model, storage, memory); // allows us to call all the variables from the previous constructor without repetition
        this.screenSize = screenSize;
    }
}
