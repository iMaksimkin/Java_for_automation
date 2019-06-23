package com.sperasoft.mood.javaforqa.task3And4.movableinterface;

import java.util.Scanner;

public class MovableDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);




        MovablePoint topLeft = new MovablePoint(0,7);
        MovablePoint bottomRight = new MovablePoint(5,5);

        System.out.println("Enter the speed: ");

        topLeft.setXSpeed(in.nextInt());
      while (topLeft.getXSpeed()<0) {


          System.out.println("Speed can't be less than 0!");
          System.out.println("Enter one more time ");
          topLeft.setXSpeed(in.nextInt());
      }
      while
        (topLeft.getXSpeed()>0)
      {

        bottomRight.setYSpeed(topLeft.getXSpeed());

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
break;
    }
}}
