package com.syntax.class18;

public class Cow {
    String breed; //instance variables
    String color;
    int age;
    double weight;

    Cow(String breed,String color,int age,double weight){ //local variables
        //When we have same name variables as local and instance inside a class,
        //local variables are always preferred by java in block of code

        this.breed=breed; //"this" keyword allows us to have same name instance and local variable
        this.color=color; //... and tells Java to use the instance variable
        this.age=age;
        this.weight=weight;
    }

    String getCowInfo(){
       return "Breed "+breed+" Color "+color+" Age "+age+" weight "+weight;
    }
}
