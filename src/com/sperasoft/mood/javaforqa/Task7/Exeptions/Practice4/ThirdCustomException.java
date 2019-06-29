package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice4;


public class ThirdCustomException extends Exception {
    String str= "ThirdExc Custom Exсeption! U hava big problem Bro!";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ThirdCustomException() {


    }

    @Override
    public String toString() {
        return "Information " +  str ;
    }

}
