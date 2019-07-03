package com.sperasoft.mood.javaforqa.task2.objects;

public class Book {
    private double price;

    private String title;
    private Author author = new Author();

    public Book(String title, Author author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public  Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                title + " " + author + " " + price;
    }

    ;


    // public void printBook() {
    //     System.out.printf(title + " " + price + " ");
    //     author.printAuthor();
    ;
    // }
}




