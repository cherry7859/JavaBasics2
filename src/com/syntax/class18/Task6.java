package com.syntax.class18;

public class Task6 {

    /*Write a java class that has 4 constructors with 4 different access levels
      (private, public, default, protected) and create 4 objects of this class:
      - inside the same class
      - from outside the class
      - inside different package
      And observe the result
     */

    String name;
    int age;
    double weight;
    String favColor;

    public Task6() {
    }

    private Task6(String pName) {
        name = pName;
    }

    Task6(int pAge) {
        age = pAge;
    }

    protected Task6(double pWeight) {
        weight = pWeight;
    }

    public static void main(String[] args) {
        Task6 object1 = new Task6();
        Task6 object2 = new Task6("Abigail");
        Task6 object3 = new Task6(65);
        Task6 object4 = new Task6(165.8);
    }

}
