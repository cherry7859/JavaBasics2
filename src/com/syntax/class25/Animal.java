package com.syntax.class25;

public interface Animal {
    void sleep();
    void eat();
}
interface Dog extends Animal{
    void Bark();
}
class Husky implements Dog{ // inherits all the methods from parent class

    @Override
    public void sleep() {
        System.out.println("Sleep 4 hours");
    }

    @Override
    public void eat() {
        System.out.println("Likes to eat meat");
    }

    @Override
    public void Bark() {
        System.out.println("Dogs favorite things");
    }
}
