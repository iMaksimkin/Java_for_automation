package com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice4;

//Create three new types of exceptions. Write a class with a method that throws all three.
// In main(), call the method but only use a single catch clause that will catch all three types of exceptions.

import com.sperasoft.mood.javaforqa.Task7.Exeptions.Practice3.CustomException;

import java.util.Scanner;

public class MultipleException {



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Print Number: ");
        int n = s.nextInt();
        try {
            if (n < 0) throw new CustomException();

            if (n == 0) throw new SecondCustomException();
            if (n > 0) throw new ThirdCustomException();
        } catch (CustomException|SecondCustomException|ThirdCustomException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Sorry. U lose :(");
        }
    }
}
