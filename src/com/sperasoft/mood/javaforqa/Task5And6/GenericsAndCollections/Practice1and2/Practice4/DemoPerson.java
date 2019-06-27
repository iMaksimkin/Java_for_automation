//package com.sperasoft.mood.javaforqa.Task5And6.GenericsAndCollections.Practice1and2.Practice4;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
//public class DemoPerson {
//    public static void main(String[] args) {
//
//    }
//
//    Comparator<Person> pcomp = new Person.PersonNameComparator();
//    TreeSet<Person> people = new TreeSet(pcomp);
//
//
//
//
//        people.add(new Person("Vasya", 23));
//        people.add(new Person("Ilya", 34));
//        people.add(new Person("Dima", 10));
//        people.add(new Person("Vanya", 14));
//
//
//    for (Person p : people) {
//
//        System.out.println(p.getName() + " " + p.getAge());
//}}