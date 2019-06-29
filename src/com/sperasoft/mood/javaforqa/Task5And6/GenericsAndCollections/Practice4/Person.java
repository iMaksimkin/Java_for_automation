
package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice4;


import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private int age=18;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {

        return ((Integer) getAge()).compareTo(p.getAge());
    }


    //(!)Implement a comparator for the Person class comparing Person first by name and if the name is equal by age.
// it will be better ti use one compare to both
// @Override
//public int compareTo(Person p) {
//
//    return Comparator.comparing(Person::getName).thenComparingInt(Person::getAge).compare(this, p);
//    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public static List<Person> getUniqueList(List<Person> p1, List<Person> p2) {


        SortedSet<Person> newList = new TreeSet<>(p1);
        newList.addAll(p2);
        SortedSet<Person> newList1 = new TreeSet<>(newList);
        return new ArrayList<>(newList1);

    }
    public static boolean isEquals (List<Person> p1, List<Person> p2) {
       if (p1.size() != p2.size() )
                return false;
        for (int i =0; i<p1.size(); i++){
            if (p1.get(i).equals(p2.get(i)))
                return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return !(obj == null || obj.getClass() != this.getClass()) && this.getName().equals(((Person) obj).getName()) && ((Person) obj).getAge() == this.getAge();
    }


    static class NameComparator implements Comparator<Person> {
        public NameComparator() {
        }

        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }

    }
}

