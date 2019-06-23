<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/Task3/inheritance/MathDemo.java
package com.sperasoft.mood.javaforqa.inheritance;
=======
package com.sperasoft.mood.javaforqa.task3And4.inheritance;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task3And4/inheritance/MathDemo.java

import java.util.Random;
import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter the size of array(5 will be enough): ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);

            System.out.println(array[i]);
        }
        System.out.println("////////////////////");


        double[] array1 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = rd.nextDouble() * 100;


            System.out.println(String.format("%.2f", (array1[i])));
        }


        CustomMathUtil math = new CustomMathUtil();


        System.out.println("\nMin=" + math.min(array));

        System.out.println("Min=" + String.format("%.2f", math.min(array1)));

        System.out.println("Max=" + math.max(array));

        System.out.println("Max=" + String.format("%.2f", math.max(array1)));

        System.out.println("Next=" + math.nextAfter(array, 33));

        System.out.println("Next=" + String.format("%.2f", math.nextAfter(array1, 22.5)));

     //   System.out.println("Enter the number: ");
     //  int n1 = in.nextInt();
    //    System.out.println("Enter the power u want raised: ");
     //  int n2 = in.nextInt();

        System.out.println("Pow = " + Math.pow(5, 4));
        System.out.println("Pow = " + String.format("%.2f", math.pow(1.5,-3)));

    }
}

