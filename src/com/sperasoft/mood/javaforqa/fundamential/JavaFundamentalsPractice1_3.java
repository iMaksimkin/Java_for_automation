package com.sperasoft.mood.javaforqa.fundamential;


import java.util.Scanner;


public class JavaFundamentalsPractice1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.print("Введите четвертое число: ");
        int d = scanner.nextInt();


        int min = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println(min);
    }
}
