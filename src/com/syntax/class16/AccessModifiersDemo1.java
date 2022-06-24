package com.syntax.class16;

public class AccessModifiersDemo1 {
    private String password = "pass123"; // b/c Private variable cannot be accessed outside the class
    int SSN = 123456; // default access - can be accessed in any class inside the package
   public String name = "Karla"; // can access in any package

    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.SSN);
        System.out.println(ac.name);
    }
}
