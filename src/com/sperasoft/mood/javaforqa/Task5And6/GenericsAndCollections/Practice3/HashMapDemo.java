package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice3;

import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Person> personsNationality = new HashMap<>();

        personsNationality.put("Greek", new Person("Dima", 13));
        personsNationality.put("Argentinian", new Person("Dasha", 13));
        personsNationality.put( "Cypriot", new Person("Misha", 44));
        personsNationality.put("Uzbek", new Person("Farid", 50));


        Set<String> names = personsNationality.keySet();

        personsNationality.remove(3);


        personsNationality.put("Russian", new Person("Yaroslav", 100));

        for (String str : names) {
            System.out.println(str+ " " + personsNationality.get(str));

        }
    }
}
