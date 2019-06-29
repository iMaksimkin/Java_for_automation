package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice3;


import com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice3.CustomException;

public class DemoCustomException {



    public static void main(String[] args) {
        CustomException customException=new CustomException();


        try {
           //do something
            throw customException;
        } catch (CustomException e) {
            e.printStackTrace();



        }
    }



}
