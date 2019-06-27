package com.sperasoft.mood.javaforqa.task2.TurtleGraphics;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

//TODO penPosition and array bounds
public class TurtleGraphics {
    private static final char[][] DEFAULT_BOARD = new char[6][5];
    public enum Direction {
        UP("u"),
        DOWN("d"),
        RIGHT("r"),
        LEFT("l");

        private String dir;

        Direction(String dir) {
            this.dir = dir;
        }

        public String getDir() {
            return dir;
        }


    }

    // @Getter
    //   @Setter
    private Position penPosition;

    //  @Getter
    //   @Setter
    private char cellChar = '.';
    //   @Getter
    //   @Setter
    private char colouredCellChar = 'o';

    // @Getter
    //   @Setter
    private char penChar = 'x';
    //  @Getter
    //   @Setter
    private char[][] board;


    public TurtleGraphics() {
    }


    public TurtleGraphics(int width, int height) {


    }

    public TurtleGraphics(Position penPosition, char cellChar, char colouredCellChar, char penChar, char[][] board) {
        this.penPosition = penPosition;
        this.cellChar = cellChar;
        this.colouredCellChar = colouredCellChar;
        this.penChar = penChar;
        this.board = board;

    }

    public TurtleGraphics(int width, int height, int x, int y) {


        if (width > 0 && height > 0) {
            this.board = new char[width + 1][height];
        } else {
            this.board = DEFAULT_BOARD;
            System.out.println("incoorect size! Default board");
        }
        if (x >= 0 && y >= 0 && x <= width && y <= height) {
            this.penPosition = new Position(x, y);
        } else {
            this.penPosition = new Position();
            System.out.println("incoorect position! Default Position ");
        }
        clearBoard();
        board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
    }


    public void showBoard() {
        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length; i++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }


    public void movePenUp(int length) {
        if (penPosition.getY() - length < 0) {
            penPosition.setY(penPosition.getY());
            System.out.println("The value is not valid. Try Again!");

        } else


            for (int i = 0; i < length; i++) {


                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setY((penPosition.getY() - 1));
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;

            }

        //  setPenPosition(new Position(penPosition.getX(), penPosition.getY()));
    }

    public void movePenDown(int length) {

        if (length + penPosition.getY() >= board[0].length) {
            penPosition.setY(board[0].length - length);
            System.out.println("The value is not valid. Try Again!");

        } else
            for (int i = 0; i < length; i++) {
                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setY(penPosition.getY() + 1);
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
            }


    }

    public void movePenLeft(int length) {
        if (penPosition.getX() - length < 0) {
            penPosition.setX(penPosition.getX());
            System.out.println("The value is not valid. Try Again!");

        } else
            for (int i = 0; i < length; i++) {

                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setX(penPosition.getX() - 1);
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
            }


    }

    public void movePenRight(int length) {

        if (length + penPosition.getX() >= board[0].length) {
            penPosition.setX(board[0].length - length);
            System.out.println("The value is not valid. Try Again!");

        } else
            for (int i = 0; i < length; i++) {

                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setX(penPosition.getX() + 1);
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;


            }


    }


    public void clearBoard() {
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = cellChar;
            }
        }


    }


//    public void setPenPosition(Position penPosition) {
//
//        this.penPosition = penPosition;
//        board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
//
//    }
}

class Position {    //inner class
    //  @Getter
    //   @Setter
    private int x;
    //   @Getter
    //   @Setter

    public void setX(int x) {
        this.x = x;
    }

    //   @Getter
    //   @Setter
    public void setY(int y) {
        this.y = y;
    }

    private int y;

    //   @Getter
    //   @Setter
    Position() {

        this.x = 0;
        this.y = 0;
    }


    Position(int x, int y) {
        if (x <= 0) this.x = 0;
        else
            this.x = x;
        if (y <= 0) this.y = 0;
        else
            this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}

