package com.sperasoft.mood.javaforqa.task2.TurtleGraphics;


import java.util.Scanner;

public class TurtleGraphicsDemo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Input the size of the board");
        System.out.println("width: ");
        int width = in.nextInt();

        System.out.println("height: ");
        int height = in.nextInt();
        System.out.println();

        System.out.println("start pen position: ");
        System.out.println("x: ");
        int y = in.nextInt();
        System.out.println("y: ");
        int x= in.nextInt();

        TurtleGraphics turtleGraphics = new TurtleGraphics(width, height, x, y);

        turtleGraphics.showBoard();

        System.out.println(" If you print u+number of dots it moves up \n If you print d+number of dots it moves down \n If you print r+number of dots it moves right  \n If you print l+number of dots it down");
        System.out.println("To clear the board print c");
        System.out.println("please write the command");

        String line = sc.nextLine();
while(true){
     String[] dir = line.trim().split(" ");

          switch (dir[0]) {
            case "u":
                turtleGraphics.movePenUp(Integer.parseInt(dir[1]));
                break;
            case "d":
                turtleGraphics.movePenDown(Integer.parseInt(dir[1]));
                break;
            case "l":
                turtleGraphics.movePenLeft(Integer.parseInt(dir[1]));
                break;
            case "r":
                turtleGraphics.movePenRight(Integer.parseInt(dir[1]));
                break;
              case "c":
                  turtleGraphics.clearBoard();
                  break;
        }
        turtleGraphics.showBoard();
        System.out.print("Print command: ");
        line = sc.nextLine();
    }
}}
