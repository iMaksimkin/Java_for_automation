package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;


public class Obj<T> {
    T object;



    public Obj() {
    }

    Obj<T> prev ;
    Obj<T> next;

    public Obj( T object,Obj<T> prev, Obj<T> next) {
        this.object = object;
        this.prev = prev;
        this.next = next;
    }

}




