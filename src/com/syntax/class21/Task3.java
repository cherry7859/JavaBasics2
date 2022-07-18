package com.syntax.class21;

public class Task3 {
    /* Create 1 class with a private method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments.
        Observe results
     */

    private void method(){
        System.out.println("Method 1");
    }
    private void method(String m1){
        System.out.println("Method 2");
    }
    private void method(int num1){
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        Task3 object = new Task3();
        object.method();
        object.method("Cherylle");
        object.method(4);
    }
}
