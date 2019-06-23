package com.sperasoft.mood.javaforqa.task1.fundamential;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter disk's amount : ");
        int amount = in.nextInt();
        solveTowers(amount, 'A', 'B', 'C');
    }

    public static void solveTowers(int number, char from, char sub, char to) {
        if (number == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            solveTowers(number - 1, from, to, sub);
            System.out.println("Disk " + number + " from " + from + " to " + to);
            solveTowers(number - 1, sub, from, to);
        }
    }
}