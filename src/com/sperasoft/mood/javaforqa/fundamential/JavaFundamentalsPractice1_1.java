package com.sperasoft.mood.javaforqa.fundamential;


import java.util.Scanner;

public class JavaFundamentalsPractice1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* TODO exeption when a=b */
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        // or we need to use
        //Integer a = scanner.nextInt();
        //    Integer b = scanner.nextInt();
        // and compare it by
        //  int min = Math.min((a.intValue()), b.intValue());
        //   System.out.println(min);
        int min;
        min = Math.min(a, b);
        System.out.println(min);
    }
}

