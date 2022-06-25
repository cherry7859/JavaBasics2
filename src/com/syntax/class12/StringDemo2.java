package com.syntax.class12;

public class StringDemo2 {
    public static void main(String[] args) {

        String str5 = "Batch 13 is good, actually very good";
        System.out.println(str5.replace("good", "Great")); // Replaces each occurrence of "good" with "Great"
        System.out.println(str5.replace("g", "G"));
        System.out.println(str5.replaceFirst("g", "G")); //Replaces first occurrence of "g" with "G"

        //Use ASCII table to see ranges

        String str = "asoijfoij98273974SDSDFGSD)#*@)*$2";

        System.out.println(str.replaceAll("[0-9]", "#")); //sfkafdb#####t####KSNDKASD!@#$((%^^
        System.out.println(str.replaceAll("[a-z]", "#")); //#######18247#8725KSNDKASD!@#$((%^^
        System.out.println(str.replaceAll("[A-Z]", "#")); //sfkafdb18247t8725########!@#$((%^^
        System.out.println(str.replaceAll("[A-Za-z]", "#")); //#######18247#8725########!@#$((%^^
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#")); //#########################!@#$((%^^
        System.out.println(str.replaceAll("[^a-z]", "_")); //sfkafdb_____t_____________________
        System.out.println(str.replaceAll("[^A-Z]", "*")); //*****************KSNDKASD*********
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));//sfkafdb18247t8725KSNDKASD*********

        str="abcdefghijkl";
        System.out.println(str.replaceAll("[a-f]", "*"));

        str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
        System.out.println(str.replaceAll("[^A-z]", "")); //remove the special characters
    }
    }

