package com.sperasoft.mood.javaforqa.Task9.Lambda;

import com.sperasoft.mood.javaforqa.task2.objects.*;

import java.util.*;
import java.util.stream.Collectors;



public class BookDemo {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Java", new Author("Bloh", "Joshua"), 90.0));
        books.add(new Book("Developing Java Software", new Author("Kirill", "Matveev"), 79.75));

        books.add(new Book("Thinking in Java", new Author("Kate", "Siera"), 50.35));
        books.add(new Book("Meditation", new Author("Osho", "Om"), 20.05));

        books.add(new Book("Java 12 comming soon", new Author("Bloh", "Joshua"), 71.71));


        System.out.println("book with the highest price;");
        System.out.println();

        List<Book> highCost = books.stream().sorted(Comparator.comparingDouble(Book::getPrice)).collect(Collectors.toCollection(LinkedList::new));

        System.out.println(highCost.get(highCost.size() - 1).toString());


        List<Book> sortedBooks = books.stream().sorted(Comparator.comparing(book -> book.getAuthor().getFirstName() + book.getAuthor().getLastName())).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Books sorted by Authors full name");
        sortedBooks.forEach(System.out::println);


        // maybe   .takeWhile but java 9
        System.out.println();

        System.out.println("Books by Joshua Bloh");
        List<Book> authorsBook = books.stream().filter(book -> book.getAuthor().getFirstName() == "Bloh" && book.getAuthor().getLastName() == "Joshua").peek(book -> System.out.print(book.getTitle() + " ")).collect(Collectors.toCollection(ArrayList::new));

        //forEach(book->System.out.println(book.getTitle())).


        double price = books.stream().map(Book::getPrice).mapToDouble(i -> i.doubleValue()).sum();

        System.out.println();
        System.out.println("Sum of all books");
        System.out.println(price);
    }
}