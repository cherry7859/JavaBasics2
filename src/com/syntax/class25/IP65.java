package com.syntax.class25;

public interface IP65 {
   // private String make = "LG"; interface can only have public fields
    //protected String make = "LG";

    String make = "Samsung"; // all variables in interfaces are automatically: public, static, final
    void wash(); // methods automatically abstract in interface

}
interface FiveG{
    void speed();
}

interface FastChargeable{
    void charging(); // all the classes inside will meet these qualities
}

class S21Ultra implements IP65, FastChargeable, FiveG{ //can't have multiple inheritances but can have multiple instances

    @Override
    public void wash(){
        System.out.println("You guys can wash me easy peasy, no issue");

    }

    @Override
    public void charging(){
        System.out.println("I support fast charging now because I have implemented this requirement as well");

    }

    @Override
    public void speed(){
        System.out.println("You can download things super fast because now I also support 5G");

    }

    public static void main(String[] args) {
        IP65 ip65 = new S21Ultra(); // can store object of S21Ultra inside class ip65
        // can only print methods from ip65, not the other classes
    }
    
}
