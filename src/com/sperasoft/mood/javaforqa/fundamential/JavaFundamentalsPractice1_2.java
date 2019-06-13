
package com.sperasoft.mood.javaforqa.fundamential;


import java.util.Scanner;

public class JavaFundamentalsPractice1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();


        int min = Math.min(c, Math.min(a, b));
        System.out.println(min);
    }
}
