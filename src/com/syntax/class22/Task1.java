package com.syntax.class22;

public class Task1 {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints "To get a degree you need high school diploma".
        - Class 'Degree' has 2 subclasses namely 'Bachelors' and 'Masters'. In Masters class override method 'getPrerequisites'.
        - Call the method by creating an object of each of the three classes*/

    public static void main(String[] args) {
        Degree deg = new Degree();
        deg.getPrerequisite();

        Bachelors bach = new Bachelors();
        bach.getPrerequisite();

        Masters mast = new Masters();
        mast.getPrerequisite();
    }
}
     class Degree {
        void getPrerequisite(){
            System.out.println("To get a degree you need high school diploma");
        }
    }
   class Bachelors extends Degree{

    }
     class Masters extends Degree{
        @Override
        void getPrerequisite(){
            System.out.println("To get a masters you must have a bachelors");
        }
    }

