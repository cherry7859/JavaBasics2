package com.syntax.class12;

public class StringDemo1 {
    public static void main(String[] args) {

        String name = new String("Oleg"); //proper way of creating an object from a class
        String name2 = "Z ameer "; //same as above
        //All the classes in java can be treated as data types,
        //... If a class is present inside the same package or if a class belongs to java.lan package

        System.out.println(name2.length()); // String; 8: Prints the length of the String, including spaces

        String captain = "NAVEED";
        System.out.println(captain.toLowerCase()); // String; naveed
        captain = "I love Java";
        System.out.println(captain.toUpperCase()); // String; I LOVE JAVA

        String name4 = "HAMID";
        System.out.println(name4.toLowerCase()); // String; hamid
        System.out.println(name4); // String; HAMID, previous print doesn't reassign variable

        String firstName = "Adem";
        String lastName = " Jones";
        String fullName = firstName+lastName; // proper way of concatenation
        System.out.println(fullName); //String; Adem Jones (There is already a space in front of Jones)

        String name3 = " ";
        System.out.println(name3.isEmpty()); // boolean; false: Checks if String is empty, spaces count as characters
        //System.out.println(name3.isBlank()); // boolean; true: Doesn't count spaces as characters

        String captainAmerica = " ne ver ";
        System.out.println(captainAmerica.trim()); // String; ne ver: Trims the white spaces before and after the String

        String str = "Batch 13 is Great";
        System.out.println(str.startsWith("Frozen")); // boolean; false
        System.out.println(str.endsWith("t")); // boolean; true
        System.out.println(str.endsWith("Great")); // boolean; true
        System.out.println(str.toLowerCase().endsWith("great")); // boolean; true: converts String to lowercase, then checks endsWith

        String query = "13";
        System.out.println(str.contains(query)); // boolean; true, Checks if str String contains ALL of query String
        System.out.println(str.contains("is")); // boolean; true
        System.out.println(str.toLowerCase().contains("batch")); // boolean; true, converts str to lowercase, then checks if contains "batch"

        name2 = "kat"; // reassign name2
        name3 = "kat"; //reassign name3
        System.out.println(name2.equals(name3)); // boolean; true
        name3 = "KAT";
        System.out.println(name2.equalsIgnoreCase(name3)); // boolean; true

        String str2 = "I am always confused";
        System.out.println(str2.indexOf("am")); // 2: Gives index of first letter of word/first occurrence
        System.out.println(str2.indexOf("always")); // 5
        System.out.println(str2.indexOf('a')); // 2
        System.out.println(str2.indexOf(' ')); // 1
        System.out.println(str2.indexOf('z')); // -1, because not present inside String

        String str3 = "Java is Easy";
        String str4 = str3.substring(0,4); // Creates a String beginning at "1st" index and ending one before "2nd" index
        System.out.println(str4); // Java
        System.out.println(str3.substring(8,12)); // Easy

    }
}
