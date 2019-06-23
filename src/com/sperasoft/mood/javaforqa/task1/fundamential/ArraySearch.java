package com.sperasoft.mood.javaforqa.fundamential;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Введите число, которое хотите найти в массиве: ");
        int number = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);


            System.out.print(arr[i] + " ");

        }


        // One By One Search
        long startTime = System.currentTimeMillis();
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                result = true;
            }
        }

        System.out.println("\n" + "One by one search result: " + result);
        System.out.println("Spent time in milliseconds: " + (System.currentTimeMillis() - startTime));

        // Binary Search
        startTime = System.currentTimeMillis();
        Arrays.sort(arr); // if its not sort it will not work
        int index = Arrays.binarySearch(arr, number);
        boolean binaryResult = false;
        if (index > 0) {
            binaryResult = true;
        }
        System.out.println("Binary search result: " + binaryResult);
        System.out.println("Spent time in milliseconds: " + (System.currentTimeMillis() - startTime));
    }

}