package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice4;


public class SecondCustomException extends Exception{

    private String str="SecondExc Custom Exception! Dont do it!";

    public SecondCustomException(String message) {
        super(message);
        this.str = str;
    }

    public SecondCustomException() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }



    @Override
    public String toString() {
        return "Information: " + str;
    }
}
