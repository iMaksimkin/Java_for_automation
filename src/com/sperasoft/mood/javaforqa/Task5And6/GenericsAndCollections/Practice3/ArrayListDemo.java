
package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice3;


import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;

import java.util.*;

import static java.util.Collections.*;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Dima", 13));
        persons.add(new Person("Dasha", 113));
        persons.add(new Person("Misha", 44));
        persons.add(new Person("Shisha", 50));
        persons.add(new Person("Elijah", 31));
        persons.add(new Person("Alla", 64));
        persons.add(new Person("Misha", 41));


        persons.remove(1);

        persons.add(new Person("XXX", 100));


        sort(persons);
        System.out.println("Sorted Arraylist without Dasha but with XXX");
        for (Person p : persons) {

            System.out.print(p.getName() + " " + p.getAge() + "\n");


        }
    }
}