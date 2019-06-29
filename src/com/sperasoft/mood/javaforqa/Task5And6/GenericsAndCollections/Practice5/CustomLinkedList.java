package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;

public class CustomLinkedList<T> {

    private Obj<T> next;
    private Obj<T> previous;

    private int size;
    

    public CustomLinkedList() {
        next = new Obj<>(null, null, null);
        previous = next;


    }

    private static class Obj<T> {

        T obj;
        Obj<T> prev = null;
        Obj<T> next = null;

        public Obj(T object, Obj<T> prev, Obj<T> next) {
            this.obj = object;
            this.prev = prev;
            this.next = next;
        }

    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void add(T obj) {
        if (obj == null) {
            throw new IllegalStateException("U can't add Null obj");
        } else {
            Obj<T> prev = previous;
            previous = new Obj<T>(obj, prev, null);
            prev.next = previous;
            size++;
        }

    }

    public Obj<T> remove(T obj) {
        if (isEmpty()) {
            throw new NullPointerException("U can remove nothing");
        } else {
            Obj<T> remove = previous;
            previous = previous.prev;
            previous.next = null;
            size--;
            return remove;
        }
    }

    //TODO reverse list
    public void reverseList() {
        if (isEmpty()) {
            throw new NullPointerException("U can reverse nothing");
        }

        Obj<T> current =next.next;
        Obj<T> before = null;
        Obj<T> next1 =current.next;
        while(current.next != null) {
        current.next =before;
        before = current;
        current = next1;
        next1 = current.next;
    }
    current.next = before;
   next.next = current;
}




    public void print() {
        Obj<T> cur = next;
        while (cur.next != null) {
            cur = cur.next;
            System.out.println(cur.obj + " ");
        }
    }
}




