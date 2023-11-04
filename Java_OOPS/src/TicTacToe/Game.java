package TicTacToe;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the board");
        int n = scan.nextInt();
        TicTacToe ticTacToe = new TicTacToe(n, 'X', 'O');
        while (!ticTacToe.isGameWon) {
            char currentPlayer = ticTacToe.currentPlayer;
            System.out.println("Player " + currentPlayer + "'s turn");
            System.out.println("Enter ROW ");
            int row = scan.nextInt();
            System.out.println("Enter COLUMN ");
            int col = scan.nextInt();
            boolean isValidMove = ticTacToe.setValueToBoard(row, col);
            if(!isValidMove) {
                System.out.println("INVALID MOVE TRY AGAIN");
            } else {
                if(ticTacToe.checkForWin()) {
                    System.out.println(currentPlayer + " WON");
                } else  {
                    ticTacToe.changePlayer();
                }
            }
        }

    }
}
