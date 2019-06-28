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

    public boolean isEmpty() {
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
//            System.out.println(previous.toString() + " " + next + " " + previous.next.toString());
        }

    }

    public Obj<T> remove(T object) {
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
        else {
           Obj<T> current = previous;
            Obj<T> prev = null;
            Obj<T> after;



            while (current != null) {
                after = current.next;
                current.next = prev;
                prev = current;
                current = after;
            } previous = prev;
        }

    }
//    Node previous = null;
//    Node current = this.head;
//    Node next;
//        while (current != null) {
//        next = current.next;
//        current.next = previous;
//        previous = current;
//        current = next;
//    }
//        this.head = previous;

//previous=next.next;
//        Object<T> current = previous;
//        Object<T> before = null;
//        Object<T> after = null;
//
//        while (current != null) {
//            after = current.next;
//
//            current.next = before;
//            before = current;
//
//            current = after;
//
//        }
//
//        next = before;
//        return after;
//
//
//    }


    public void print() {
        Obj<T> cur = next;
        while (cur.next != null) {
            cur = cur.next;
            System.out.println(cur.obj + " ");
        }
    }
}




