package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice5;


public class FirstExc extends Exception {
    private String str="Error";

    public String getStr() {
        return str;
    }

    public FirstExc() {
    }

    public void setStr(String str) {
        this.str = str;
    }



    @Override
    public String toString() {
        return "Information: " + str;
    }
}
