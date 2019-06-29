package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice1;

//Write code to generate and catch an ArrayIndexOutOfBoundsException.
//


public class ArrOutOfBounds {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5};

try

             {
                System.out.println(array[7]);



    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Something Wrong!");
        System.out.println(e);


    }}}