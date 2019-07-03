package MineSweeper;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print size of the board: ");
        int size = sc.nextInt();

        System.out.println("Print amount of mines: ");


        int mine = sc.nextInt();

        MineSweeper mineSweeper = new MineSweeper(size, mine);

       //   mineSweeper.showGeneratedBoardTemp();   //  if u need to be insure the way how minesweeper generate mines uncomment this line and method


        while (true) {


            if (mineSweeper.getEnd() == true && mineSweeper.getWin() == true) {

                System.out.println("You win!");

                break;
            } else if (mineSweeper.getEnd() == true) {

                break;
            } else if (mineSweeper.getEnd() == false) {
                int x;
                int y;
                System.out.print("Enter  x: ");
                x = sc.nextInt();
                System.out.print("Enter y: ");
                y = sc.nextInt();
                mineSweeper.turn(x, y);
                mineSweeper.countCell();
                mineSweeper.findMineAround();
                mineSweeper.refreshBoard();

            }

        }
    }
}
