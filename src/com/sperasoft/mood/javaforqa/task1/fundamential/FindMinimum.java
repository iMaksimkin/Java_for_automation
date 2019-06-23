package com.sperasoft.mood.javaforqa.task1.fundamential;


public class FindMinimum {
    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int min(int a, int b, int c) {
        return min(a, b) < c ? min(a, b) : c;
    }

    private static int min(int a, int b, int c, int d) {
        return min(a, b, c) < d ? min(a, b, c) : c;
    }
}
