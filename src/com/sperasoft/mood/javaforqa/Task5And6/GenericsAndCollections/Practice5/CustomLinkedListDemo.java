package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice5;


import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;

public class CustomLinkedListDemo {
    public static void main(String[] args) {


        {

            CustomLinkedList<Person> myList1 = new CustomLinkedList<Person>();

            myList1.add(new Person("Dima", 13));
            myList1.add(new Person("Dasha", 113));
            myList1.add(new Person("Misha", 44));
            myList1.add(new Person("Sasha", 13));
            myList1.add(new Person("XXX", 4));

            System.out.println("My List");

            myList1.print();

            myList1.reverseList();
            System.out.println("Reverse List");
            myList1.print();


            myList1.remove(3);
            System.out.println("List with deleted Person");
            myList1.print();

            System.out.println("Print with Iterator");
            myList1.printWithIterator();


        }
    }
}


