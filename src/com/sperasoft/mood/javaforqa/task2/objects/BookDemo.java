package com.sperasoft.mood.javaforqa.task2.objects;


public class BookDemo {
    public static void main(String[] args) {
       Author author = new Author("Russel", "Winderand");
        Book book = new Book("Developing Java Software", author, 79.75);


        //   book.printBook();
        System.out.println(book.toString());
    }
}
