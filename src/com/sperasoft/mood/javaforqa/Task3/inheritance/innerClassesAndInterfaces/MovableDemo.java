package com.sperasoft.mood.javaforqa.Task3.innerClassesAndInterfaces;

public class MovableDemo {
    public static void main(String[] args) {

        MovablePoint topLeft = new MovablePoint(0,7,2,5);
        MovablePoint bottomRight = new MovablePoint(5,5,1,3);
        MovableRectangle Rectangle = new MovableRectangle(topLeft,bottomRight);

        System.out.println("The position of rectangle" + "\n" + Rectangle);


        Rectangle.moveUp();
        System.out.println("Move up");
        System.out.println(Rectangle);

        Rectangle.moveDown();
        System.out.println("Move down");
        System.out.println(Rectangle);

        Rectangle.moveLeft();
        System.out.println("Move left");
        System.out.println(Rectangle);

        Rectangle.moveRight();
        System.out.println("Moove right");
        System.out.println(Rectangle);

    }
}
