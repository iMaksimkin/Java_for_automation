package com.sperasoft.mood.javaforqa.inheritance;

public class CustomMathUtil {


    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }


    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int nextAfter(int[] array, int number) {
        int result = 0;
        for (int i : array)
            if (i > number)
                return i;

        return result;
    }

    public static double nextAfter(double[] array, double number) {
        double result = 0;
        for (double i : array)
            if (i > number)
                return i;

        return result;
    }

    public static int pow(int base, int n) {

        if (n == 0)
            return 1;
        if
                (n == 1) return base;
        if (n < 0) {
            int num = 1;
            for (int i = 1; i < -n; i++) {
                num /= n;
            }
            return num;
        } else return (base * (pow(base, n - 1)));
    }

 /*   public static int pow(int base, int exponent) {
        int r = 1;
        for (int i = 0; i < exponent; i++) r *= base;
        return r;
    } */


    public static double pow(double base, int n) {
        if (n == 0)
            return 1;
        if
                (n == 1) return base;
        if (n < 0) {
            double num = 1;
            for (int i = 1; i < -n; i++) {
                num /= n;
            }
            return num;
        } else return (base * (pow(base, n - 1)));
    }

}


