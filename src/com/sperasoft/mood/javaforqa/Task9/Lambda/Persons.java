package com.sperasoft.mood.javaforqa.Task9.Lambda;

import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;


import java.util.*;
import java.util.stream.*;



public class Persons {

    public static void main(String[] args) {


        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Dima"));   // default 18
        persons.add(new Person("Dan", 24));
        persons.add(new Person("Misha", 24));
        persons.add(new Person("Shisha", 28));
        persons.add(new Person("Konstantin", 26));
        persons.add(new Person("Alla", 64));
        persons.add(new Person("Misha", 24));


        List<String> result = persons.stream().filter(person -> (person.getAge() > 20 && person.getAge() < 30)).map(name -> name.getName().toUpperCase()).sorted(Comparator.comparingInt(String::length)).distinct().collect(Collectors.toCollection(ArrayList::new));

        result.forEach(System.out::println);

       // System.out.println(result);

    }
}