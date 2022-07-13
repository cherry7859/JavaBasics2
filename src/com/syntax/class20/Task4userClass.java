package com.syntax.class20;
/*Write program: userClass that has a constructor that initializes instance variable name and mobile number.
    Create a subclass userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number, and address in userDetails method.
 */

public class Task4userClass {
    String name;
    String mobileNumber;

    Task4userClass(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends Task4userClass{
    String address;

    UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address = address;
    }
    void printUserDetails(){
        System.out.println("Name: "+name+", Phone Number: "+mobileNumber+", Address: "+address);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Cherylle", "823-444-1234", "123 Lazy St.");
        userInfo.printUserDetails();
    }

}
