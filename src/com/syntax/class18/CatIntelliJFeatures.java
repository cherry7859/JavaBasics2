package com.syntax.class18;

public class CatIntelliJFeatures {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    //Auto-generate Constructor: Right click --> Generate --> Constructor --> select parameters

    public CatIntelliJFeatures(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    //Show File History: File(For IntelliJ) --> Local History --> Show History
    //Works even if file is deleted. Do it by showing local history for package
}
