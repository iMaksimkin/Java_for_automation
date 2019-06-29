package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice5;


public class ThirdExc extends SecondExc {

private String thirdException= "Error";


    public String getThirdException() {
        return thirdException;
    }

    public void setThirdException(String thirdException) {
        this.thirdException = thirdException;
    }

    public ThirdExc() {
    }

    public ThirdExc(String thirdException) {
        this.thirdException = thirdException;
    }

    @Override
    public String toString() {
        return "This is third Exception: " + thirdException;
    }
}
