package com.syntax.class26;

public interface MoveAble {
    void move();
}

class Car implements MoveAble{
    @Override // optional annotation
    public void move() {
        System.out.println("A car can move");
    }
    public void park(){
        System.out.println("You can park me");
    }
}

class Person implements MoveAble{
    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}
class Test {
    public static void main(String[] args) {


        MoveAble moveAble = new Car(); //widening
        moveAble.move();
        //moveAble.park(); //Cannot use moveAble interface to call park b/c it doesn't even know park exists
        ((Car)(moveAble)).park(); //narrowing from Car object to moveAble

        //with interface we can also use Polymorphism
        MoveAble [] moveAbles = {new Car(), new Person()};
    }
}