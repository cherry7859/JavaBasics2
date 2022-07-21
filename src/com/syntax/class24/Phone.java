package com.syntax.class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlock(); // abstract methods don't have body

    void sendText(){
        System.out.println("Use the Messenger app to send the msg");
    }
}

class Iphone extends Phone{ // must use all parent methods in the non-abstract class
    @Override
    void displayPictures(){
        System.out.println("Use the Photos app to display the pictures");
    }
    @Override
    void unlock(){
        System.out.println("Use FaceId to unlock the phone");
    }
}

abstract class Samsung extends Phone{

}
class GooglePixel extends Phone{
    @Override
    void displayPictures(){
        System.out.println("Use the Gallery to display the pictures");
    }
    @Override
    void unlock(){
        System.out.println("Use finger print sensor or face unlock to unlock your phone");
    }
}
class Tester{
    public static void main(String[] args) {
       // Samsung samsung = new Samsung(); // cannot create objets of abstract classes

        GooglePixel googlePixel = new GooglePixel();
        googlePixel.displayPictures();
    }
}
