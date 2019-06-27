package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice3;


import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {


       Collection<Person> persons = new PriorityQueue<>();


        persons.add(new Person("Shisha", 50));
        persons.add(new Person("Elijah", 31));
        persons.add(new Person("Alla"));
        persons.add(new Person("Misha", 41));

    persons.remove(new Person("Misha", 41));
    persons.add(new Person("Kirill"));

        for (Person p : persons)
            System.out.println(p + " ");
    }
    }

