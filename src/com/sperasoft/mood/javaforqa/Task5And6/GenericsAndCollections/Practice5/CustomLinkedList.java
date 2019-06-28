package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;




public class CustomLinkedList<T> {

    private Object<T> next;
    private Object<T> previous;

    private int size;


    public CustomLinkedList() {
        next = new Object<>(null, null, null);
        previous = next;


    }

    private static class Object<T> {

        T object;
        Object<T> prev = null;
        Object<T> next = null;

        public Object(T object, Object<T> prev, Object<T> next) {
            this.object = object;
            this.prev = prev;
            this.next = next;
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T object) {
        if (object == null) {
            throw new IllegalStateException("U can't add Null obj");
        } else {
            Object<T> prev = previous;
            previous = new Object<T>(object, prev, null);
            prev.next = previous;
            size++;
        }

    }

    public Object<T> remove(T object) {
        if (isEmpty()) {
            throw new NullPointerException("U can remove nothing");
        } else {
            Object<T> remove = previous;
            previous = previous.prev;
            previous.next = null;
            size--;
            return remove;
        }
    }

    //TODO reverse list
    public Object<T> reverseList() {
        if (isEmpty()) {
            throw new NullPointerException("U can reverse nothing");
        }
previous=next.next;
        Object<T> current = previous;
        Object<T> before = null;
        Object<T> after = null;

        while (current != null) {
            after = current.next;

            current.next = before;
            before = current;

            current = after;

        }

        next = before;
        return after;


    }


    public void print() {
        Object<T> cur = next;
        while (cur.next != null) {
            cur = cur.next;
            System.out.println(cur.object + " ");
        }
    }
}




