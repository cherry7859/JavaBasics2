package com.syntax.class18;


public class Task9Book {
    /* Write Book class that will have instance variables and 2 Constructors.
       While creating an object make sure: Instance variables are being initialized
       and Both Constructors are being executed.
     */

    String title;
    int pages;
    String author;

    Task9Book() {
    }

    Task9Book(int bookPages) {
        pages = bookPages;
    }

    public static void main(String[] args) {
        Task9Book book1 = new Task9Book();
        book1.title = "A Wrinkle in Time";
        book1.pages = 249;
        book1.author = "First Last";
        System.out.println("Title: " + book1.title + "; Pages: " + book1.pages + "; Author: " + book1.author);


        Task9Book book2 = new Task9Book(500);
        book2.title = "The Best Book Ever!";
        book2.author = "Pseudonymous Bosch";
        System.out.println("Title: "+book2.title+"; Pages: "+book2.pages+"; Author: "+book2.author);
    }

}