package com.sperasoft.mood.javaforqa.task1.fundamential;


import java.util.InputMismatchException;
import java.util.Scanner;
// TODO: write the class that will caght   InputMismatchException 
public class CountStringElements {


    public static void main(String[] args) throws InputMismatchException {
        String text = "some text";
        Scanner in = new Scanner(System.in);
        System.out.println("enter the symbol: ");
        // String str = in.next();
        // char a = str.charAt(str.length()-1);

        char c = in.next(".").charAt(0);


        int summ = 0;
        char[] a = text.toCharArray();
        for (int i = 0; i < a.length; i++) 
            if (a[i] == c) {
                summ++;


            }
            System.out.println("symbols in text " + c + ": " + summ);

        }
    }


