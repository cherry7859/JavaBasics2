package com.syntax.class26;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjectsSeen = new ArrayList();
        subjectsSeen.add("SDLC");
        subjectsSeen.add("Manual Testing");
        subjectsSeen.add("Java");
        subjectsSeen.add("Git");
        subjectsSeen.add("Selenium");

        ArrayList<String> futureSubjects = new ArrayList<>();
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("API");
        futureSubjects.add("Jenkins");
        futureSubjects.add("AWS");
        futureSubjects.add("Docker");
        futureSubjects.add("APIUM");

        ArrayList<String> allSubjects = new ArrayList<>();
        allSubjects.addAll(subjectsSeen);
        allSubjects.addAll(futureSubjects);
        System.out.println("allSubjects = " + allSubjects); // Combine the arrays into one without for loop

        ArrayList<String> allSubjects2 = new ArrayList<>();
        allSubjects2.addAll(subjectsSeen);
        //Insert the data starting from index 1 and will push the existing data towards the end
        allSubjects2.addAll(1, futureSubjects);
    }
}
/*ShortcutNotes:
    ctrl+c --> select the complete line
    soutv --> print the last/completed variable
    iter --> loop through the elements
    reiter --> loop in reverse order
 */
