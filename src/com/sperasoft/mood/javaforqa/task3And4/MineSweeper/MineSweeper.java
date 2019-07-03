package com.sperasoft.mood.javaforqa.task3And4.MineSweeper;

public class MineSweeper {


    private char[][] board;
    private char[][] mineBoard;

    public static final char CELL = '.';
    public static final char MINE = '*';
    public static final char EMPTY = ' ';
    public Boolean isWin = false;
    public Boolean isEnd = false;
    public static final int DEFAULT_SIZE = 7; // coming soon Default boar and num of mines if enter incorrect value // first version for board size 5 

    public MineSweeper(int size, int mine) {
        size += 2;                               // sorry for this. need to separate to boards in initiateBoard method. will do it as soon as possible 
        board = createBoard(size);
        mineBoard = new char[size][size];
        initiateBoard(mineBoard);
        generateMines(mine);
        findMineAround();
        showboard(board);


    }

    private char[][] createBoard(int size) {
        char ch[][] = new char[size][size];
        return ch;
    }


    public void initiateBoard(char[][] mineBoard) {


        for (int x = 0; x < mineBoard.length; x++) {
            for (int y = 0; y < mineBoard[0].length; y++) {
                if ((x == 0 || x == mineBoard.length - 1) || (y == 0 || y == mineBoard[0].length - 1)) {
                    mineBoard[x][y] = EMPTY;
                    board[x][y] = EMPTY;
                } else {
                    mineBoard[x][y] = CELL;
                    board[x][y] = CELL;
                }


            }
        }
    }


    public void showboard(char[][] ch) {
        for (int x = 1; x < ch.length - 1; x++) {
            for (int y = 0; y < ch.length; y++) {


                System.out.print(ch[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void refreshBoard() {
        System.out.println();
        showboard(board);
    }

    public void showGeneratedBoardTemp() {
        System.out.println();
        showboard(mineBoard);
    }

    public void generateMines(int mine) {
        for (int n = 0; n < mine; n++) {
            while (true) {
                int x = 0;
                int y = 0;
                x = (int) (board.length * Math.random());
                y = (int) ( board[0].length * Math.random());
                if (x >= 1 && x <= board.length - 2 && y >= 1 && y <= board[0].length - 2) {

                    if (!(mineBoard[x][y] == MINE)) {
                        mineBoard[x][y] = MINE;
                        break;
                    }
                }
            }


        }


    }


    public Boolean getEnd() {
        return isEnd;
    }


    public void findMineAround() {
        for (int x = 1; x < board.length - 2; x++) {
            for (int y = 1; y < board.length - 2; y++) {
                if ((mineBoard[x][y] == ' ')) {
                    int nums = 0;
                    for (int i = (x - 1); i <= (x + 1); i++) {
                        for (int j = (y - 1); j <= (y + 1); j++) {
                            if (mineBoard[i][j] == '*')
                                nums++;
                        }
                    }
                    board[x][y] = Integer.toString(nums).charAt(0);    // ran into the problem but had found this way from int to char
                }
            }
        }
    }


    public void turn(int x, int y) {
        if (mineBoard[x][y] == MINE) {

            System.out.println("U LOSE!");
            showboard(mineBoard);
            System.out.println("Maybe a new game?");
            isWin = false;
            isEnd = true;


        } else if (mineBoard[x][y] == CELL) {
            mineBoard[x][y] = EMPTY;
            board[x][y] = EMPTY;
            isEnd = false;

        }

    }

    public void countCell() {
        int cell = 0;
        for (int x = 0; x < mineBoard.length; x++) {
            for (int y = 0; y < mineBoard[0].length; y++) {
                if (mineBoard[x][y] == CELL)
                    cell++;
            }

        }
        if (cell != 0)
            isWin = false;

        else {
            isWin = true;
            isEnd = true;
        }
    }

    public Boolean getWin() {
        return isWin;
    }
}
