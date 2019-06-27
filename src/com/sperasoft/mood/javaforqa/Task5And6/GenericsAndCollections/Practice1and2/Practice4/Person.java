package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice1and2.Practice4;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    protected String name;
    protected int age;

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
    public int compareTo(Person a) {
        return (int) (a.getAge() - this.getAge());
    }


    static class PersonNameComparator implements Comparator<Person> {

        public int compare(Person a, Person b){

            return a.getName().compareTo(b.getName());

        }
    }


//    @Override
//    public int compareTo(Person o) {
//        return o.getName().compareTo(this.getName());
//    }
}