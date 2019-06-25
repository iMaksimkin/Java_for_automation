package com.sperasoft.mood.javaforqa.TurtleGraphics;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

//TODO penPosition and array bounds
public class TurtleGraphics {
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
        if (width > 0 && height > 0) this.board = new char[width][height];

        else System.out.println("incoorect size! ");
        clearBoard();
    }

    public TurtleGraphics(Position penPosition, char cellChar, char colouredCellChar, char penChar, char[][] board) {
        this.penPosition = penPosition;
        this.cellChar = cellChar;
        this.colouredCellChar = colouredCellChar;
        this.penChar = penChar;
        this.board = board;

    }

    public TurtleGraphics(int width, int height, int x, int y) {

        //  this.penPosition = new Position(x, y);
        //   this.board = new char[width][height];
        if (width > 0 && height > 0) this.board = new char[width + 1][height];
        else System.out.println("incoorect size! ");
        if (x >= 0 && y >= 0) this.penPosition = new Position(x, y);
        else System.out.println("incoorect position! ");
        clearBoard();
        board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
    }


    public void showBoard() {
        for (char[] chars : board) {
            for (char Char : chars) {
                System.out.print(Char + " ");
            }
            System.out.println();
        }


    }


    public void movePenUp(int length) {

        if (penPosition.getX() > board[0].length) {
            penPosition.setX(0);
        } else
            for (int i = 0; i < length; i++) {

                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setX(penPosition.getX() - 1);
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
            }

        //  setPenPosition(new Position(penPosition.getX(), penPosition.getY()));
    }

    public void movePenDown(int length) {

        if (penPosition.getX() > board[0].length) {
            penPosition.setX(0);
        } else
            for (int i = 0; i < length; i++) {

                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setX(penPosition.getX() + 1);
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;


            }


    }

    public void movePenLeft(int length) {

        if (penPosition.getY() > board[0].length) {
            penPosition.setY(0);
        } else
            for (int i = 0; i < length; i++) {

                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setY((penPosition.getY() - 1));
                board[this.penPosition.getX()][this.penPosition.getY()] = penChar;

            }


    }

    public void movePenRight(int length) {
        if (penPosition.getY() > board[0].length) {
            penPosition.setY(0);
        } else
            for (int i = 0; i < length; i++) {
                board[penPosition.getX()][penPosition.getY()] = colouredCellChar;

                penPosition.setY(penPosition.getY() + 1);
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


    public void setPenPosition(Position penPosition) {

        this.penPosition = penPosition;
        board[this.penPosition.getX()][this.penPosition.getY()] = penChar;

    }
}
         class Position {    //inner class  /// maybe static?
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
