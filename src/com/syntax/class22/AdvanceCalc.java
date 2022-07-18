package com.syntax.class22;

public class AdvanceCalc {
    static void sum(int ... arr){ //end user can put as many parameters as needed
       // System.out.println(arr[0]); //print 2
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all parameters is "+sum);
    }
    //Var args (variable arguments) demo
    static void printNames(String ... names){
        for(String name:names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sum(2,4,5,6,7,8);// this is an array
        printNames("Aladin", "Cherylle");
        int age = 10;
       /* String name;
        if(age>18){
            name = "Time to go to work");
        } else{
            name = "Enjoy no work");
        }
        System.out.println(name);*/

        //Ternary operator
        String name2 = age>18?"Time to got to work":"Enjoy no work"; //Updated way to write the if condition
        System.out.println(name2);
    }
}
