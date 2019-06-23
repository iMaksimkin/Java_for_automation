package com.sperasoft.mood.javaforqa.objects1;


public class Author {

    public Author() {
    }

    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return " " + firstName + " " +
                lastName;
    }

    ;


    //   public void printAuthor() {
    //     System.out.println(firstName + " " + lastName + " ");

    //  }
}

