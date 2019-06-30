package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;

public class CustomLinkedList<T> {

    private Obj<T> last = null;
    private Obj<T> previous = null;

    private int size;


    public CustomLinkedList() {


        previous = new Obj<>(null, null, null);
        last = previous;

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


    public void remove(int index) {
        if (index == 0) {
            last = last.next;
        } else {
            Obj current = last;
            Obj before = null;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            before = current.next;
            current.next = before.next;
        }
    }


    class Iterator {
        Obj iterator;

        public Iterator() {
            this.iterator = previous;
        }

        public boolean hasNext() {
            return iterator.prev.next != null;
        }

        public void next() {
            iterator = iterator.next;
        }
    }

    public void printWithIterator() {

        Iterator iterator = this.new Iterator();
        for (int i = 1; i < size; i++) {
            System.out.println(iterator.iterator.object);
            iterator.next();
        }
    }


    public void reverseList() {
        if (isEmpty()) {
            throw new NullPointerException("U can reverse nothing");
        }

        Obj<T> current = last.next;
        Obj<T> before = null;
        Obj<T> after = current.next;
        while (current.next != null) {
            current.next = before;
            before = current;
            current = after;
            after = current.next;
        }
        current.next = before;
        last.next = current;
    }


    public void print() {
        Obj<T> cur = last;
        while (cur.next != null) {
            cur = cur.next;
            System.out.println(cur.object + " ");
        }
    }
}
//    public void remove(T remove) {
////        if (isEmpty()) {
////            throw new NullPointerException("U can remove nothing");
////        }   else (
//
//        Obj<T> curr = previous;
//
//        curr = curr.prev;
//        for (int i = 0; i < size; i++) {
//            curr = curr.next;
//            if (curr.object.equals(remove)) {
//                curr.prev.next = curr.next;
//                curr.next.prev = curr.prev;
//
//
//                size--;
//                break;
//            }
//        }
    //  }





