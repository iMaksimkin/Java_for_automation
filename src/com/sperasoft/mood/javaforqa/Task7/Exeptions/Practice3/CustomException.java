package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice3;

//Create your own exception class using the extends keyword.
// Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
// Write a method that prints out the stored String.
// Create a try-catch clause to exercise your new exception.

public class CustomException extends Exception {


    private String str="Some information about exception";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public CustomException(String message, String str) {
        super(message);

        this.str = str;

    }
    public CustomException( String str) {


        this.str = str;
    }

    public CustomException() {
    }

    @Override
    public String toString() {
        return str + " and more and more information about Exception";
    }
}

