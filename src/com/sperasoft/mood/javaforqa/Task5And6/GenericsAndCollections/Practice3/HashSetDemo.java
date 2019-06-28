<<<<<<< Updated upstream
package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice3;


import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {


    Collection<Person> wPersons = new HashSet<>();
            wPersons.add(new Person("Mrs.xz", 13));
            wPersons.add(new Person("Shisha", 20));
            wPersons.add(new Person("Shisha", 20));
            wPersons.add(new Person("Alla",6));
            wPersons.add(new Person("Alla",50));

            wPersons.remove(new Person("Mrs.xz", 13));

            wPersons.add(new Person("XXX"));

        System.out.println("Sorted women name list by Age");
        TreeSet<Person> sortedWPerson = new TreeSet<>();
        sortedWPerson.addAll(wPersons);
        for (Person p : sortedWPerson)
            System.out.println(p + " ");


}
    }
=======
package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice3;


import com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {


        Collection<Person> wPersons = new HashSet<>();
        wPersons.add(new Person("Mrs.xz", 13));
        wPersons.add(new Person("Shisha", 20));
        wPersons.add(new Person("Shisha", 20));
        wPersons.add(new Person("Alla", 6));
        wPersons.add(new Person("Alla", 50));

        wPersons.remove(new Person("Mrs.xz", 13));

        wPersons.add(new Person("XXX"));

        System.out.println("Sorted women name list by Age");
        TreeSet<Person> sortedWPerson = new TreeSet<>();
        sortedWPerson.addAll(wPersons);
        for (Person p : sortedWPerson)
            System.out.println(p + " ");


    }
}
>>>>>>> Stashed changes
