package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice1and2.Practice1And2;


import com.sperasoft.mood.javaforqa.task3And4.inheritance.Shape;

public class Pair <T1, T2 >
// or like this public class Pair <T1, T2 extends Shape>
{

        private T1 t1;
        private T2 t2;

    public Pair() {
    }

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getFirst(){
        return t1;
    }

    public T2 getSecond() {
        return t2;
    }


   public static  <T extends Comparable<T>> boolean compare(T t1, T t2) {

        return t1.compareTo(t2) == 0;
    }

}

