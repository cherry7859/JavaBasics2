package com.syntax.class16;

import org.omg.Messaging.SyncScopeHelper;
import sun.security.jca.GetInstance;

import java.sql.SQLOutput;

public class InstanceDemo {

    String str = "instance";

    void changeInstanceValue(){
        str = "method1";
    }

    void printInstanceValue(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str); //prints the value of str, which is instance
        id.printInstanceValue(); // method prints the value of str, which is still instance
        id.changeInstanceValue(); // this method changes the instance variable value, reassigns
        id.printInstanceValue(); //  prints the value of str, which is now reassigned
    }
}
