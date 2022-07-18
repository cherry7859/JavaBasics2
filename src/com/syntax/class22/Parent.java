package com.syntax.class22;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Parent {
    String name;

    void getMarried() {
        System.out.println("Hey Hamid, we have found a girl for your to get married");
    }
}
    class Hamid {
        void getMarried() {
            System.out.println("I want to try on Tara first"); // this method overrides the parent method
        }


        public static void main(String[] args) {
            Hamid hamid = new Hamid();
            hamid.getMarried();
        }

    }