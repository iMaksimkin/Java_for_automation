package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;


<<<<<<< Updated upstream
public class CustomLinkedList<T> {

    private Object<T> next;
    private Object<T> previous;

    private int size;


    public CustomLinkedList() {
        next = new Object<>(null, null, null);
        previous = next;


    }

    public static class Object<T> {

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
            next = new Object<T>(object, prev, null);
            prev.next = previous;
            size++;
        }
    }

    public Object<T> remove() {
        if (isEmpty()) {
            throw new NullPointerException("U can remove nothing");
        } else {
            Object<T> remove = previous;
            previous.prev = previous;
            previous.next = null;
            size--;
            return remove;
        }
    }


}


=======
public class CustomLinkedList {
    public class Node
    {
        public Node next;
        public Object data;
    }

    public class LinkedList
    {
        private Node head;

        public void printAllNodes()
        {
            Node current = head;
            while (current != null)
            {
                Console.WriteLine(current.data);
                current = current.next;
            }
        }

        public void AddFirst(Object data)
        {
            Node toAdd = new Node();

            toAdd.data = data;
            toAdd.next = head;

            head = toAdd;
        }

        public void AddLast(Object data)
        {
            if (head == null)
            {
                head = new Node();

                head.data = data;
                head.next = null;
            }
            else
            {
                Node toAdd = new Node();
                toAdd.data = data;

                Node current = head;
                while (current.next != null)
                {
                    current = current.next;
                }

                current.next = toAdd;
            }
        }
    }
}
>>>>>>> Stashed changes
