
package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4;

import java.util.*;

import static com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person.isEquals;

public class PersonDemo {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Dima"));
        persons.add(new Person("Dasha", 113));
        persons.add(new Person("Misha", 44));
        persons.add(new Person("Shisha", 50));
        persons.add(new Person("Elijah", 31));
        persons.add(new Person("Alla", 64));
        persons.add(new Person("Misha", 41));

        System.out.println("sorted");

        Collections.sort(persons);
        for (Person p : persons) {
            System.out.print(p.getName() + " " + p.getAge() + "\n");

        }

        System.out.println();
        // The same method
//

   //     persons.sort(Person::compareTo);
        persons.sort(new Person.NameComparator());
        System.out.println("sort firstly by name and if the name is equal by age");
        for (Person p : persons) {

            System.out.print(p.getName() + " " + p.getAge() + "\n");

        }
        System.out.println();
        Collections.shuffle(persons);
        List<Person> wPersons = new ArrayList<>();
        wPersons.add(new Person("Mrs.xz", 11));
        wPersons.add(new Person("Dasha", 113));
        wPersons.add(new Person("Shisha", 50));
        wPersons.add(new Person("Erica", 20));
        wPersons.add(new Person("Alla", 64));
        System.out.println("SecondExc list with woman names");
        for (Person p : wPersons) {

            System.out.print(p.getName() + " " + p.getAge() + "\n");

        }
        System.out.println();
        System.out.println("Unique List ( without doubled woman names)");

        for (Person p : Person.getUniqueList(persons,wPersons)) {
            System.out.print(p.getName() + " " + p.getAge() + "\n");

        }
        System.out.println();
        System.out.print("Is FirstExc equals SecondExc: ");


            System.out.print(isEquals(persons,wPersons));
    }


}


