<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task2/objects1/Book.java
=======
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/objects1/Book.java
<<<<<<< Updated upstream:src/com/sperasoft/mood/javaforqa/objects1/Book.java
package com.sperasoft.mood.javaforqa.objects1;
=======
package com.sperasoft.mood.javaforqa.task2.objects1;
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task2/objects1/Book.java

class Book {
    private double price;

    private String title;
    Author author = new Author();

    public Book(String title, Author author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
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




=======
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/objects1/Book.java
package com.sperasoft.mood.javaforqa.task2.objects1;

class Book {
    private double price;

    private String title;
    private Author author = new Author();

    public Book(String title, Author author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
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




<<<<<<< 092f7de4c8ac4792505cbba5be27b5f3c02b5b4e:src/com/sperasoft/mood/javaforqa/task2/objects1/Book.java
=======
>>>>>>> Stashed changes:src/com/sperasoft/mood/javaforqa/task2/objects1/Book.java
>>>>>>> updating project structure and some classes:src/com/sperasoft/mood/javaforqa/objects1/Book.java
