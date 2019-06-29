package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice5;


public class SecondExc extends FirstExc {

    private String secondException;




    public String getSecondException() {
        return secondException;
    }

    public void setSecondException(String secondException) {
        this.secondException = secondException;
    }

    public SecondExc() {
    }



    @Override
    public String toString() {
        return secondException;
    }
}
