package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice5;


public class Demo {
    public static void main(String[] args) {

                try { //do smth
                    throw new ThirdExc("Error");
                } catch (FirstExc e) {
                    System.out.println(e.toString());
                }


        }
    }



