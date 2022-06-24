package com.syntax.class15;

public class ArrayUtils {

    void printArray(int [] arr){ //create method to use everytime have eot print arraay
        for(int num:arr){
            System.out.println(num);
        }
    }

    int sumArray(int [] arr) { //create method to print sum of array
        int sum = 0;
        for (int num:arr) {
            sum = sum+num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.printArray(arr);//will print the array

        int sum = arrayUtils.sumArray(arr);
        System.out.println(sum);//will print the sum of the array
    }

}