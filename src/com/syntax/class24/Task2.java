package com.syntax.class24;

public class Task2 {
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new PdfFile(), new WordFile()};
        for (File file : files) {
            file.open(); // prints all the open methods from classes
        }
    }
}
 abstract class File {

     abstract void open();

     void edit() {
         System.out.println("Editing the file");
     }

     void close() {

         System.out.println("Closing the file");
     }
 }

    class JavaFile extends File {
        @Override
        void open() {
            System.out.println("Open .java file using notepad++");
        }

    }

    class WordFile extends File{
        @Override
        void open(){
            System.out.println("Open .doc file using Microsoft Word");
        }
    }

    class PdfFile extends File{
        @Override
        void open(){
            System.out.println("Open .pdf file using Adobe");
        }

    }

