package TicTacToe;

public class TicTacToe {
    int boardSize;
    char[][] board;
    char[] players = new char[2];
    char currentPlayer;
    boolean isGameWon;

    TicTacToe(int boardSize, char player1, char player2) {
        this.boardSize = boardSize;
        board = new char[boardSize][boardSize];
        isGameWon = false;
        players[0] = player1;
        players[1] = player2;
        currentPlayer = player1;
        initializeBoard(boardSize);
        printBoard(board);
    }

    public void initializeBoard(int boardSize) {
        System.out.println("Initializing Bord for players " + players[0] + " and " + players[1]);
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '.';
            }
        }
    }

    public char changePlayer() {
        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }
        return currentPlayer;
    }

    public boolean setValueToBoard(int row, int column) {
        if (board[row][column] == '.') {
            board[row][column] = currentPlayer;
            printBoard(board);
            return true;
        } else {
            return false;
        }
    }

    public boolean rowCheck() {
        boolean isRowWin = true;
        for (int i = 0; i < board.length; i++) {
            isRowWin = true;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != currentPlayer) {
                    isRowWin = false;
                }
            }
            if(isRowWin) return true;
        }
        return isRowWin;
    }

    public boolean columnCheck() {
        boolean isColumnWin = true;
        for (int i = 0; i < board.length; i++) {
            isColumnWin = true;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != currentPlayer) {
                    isColumnWin = false;
                }
            }
            if(isColumnWin) return true;
        }
        return isColumnWin;
    }

    public boolean diagonalWinLeftToRight() {
        for(int i = 0;i < board.length; i++) {
            if(board[i][i] != currentPlayer) {
                return false;
            }
        }
        return true;
    }
    public boolean diagonalWinRightToLeft() {
        for(int i = 0;i < board.length; i++) {
            if(board[i][(board.length - 1) - i] != currentPlayer) {
                return false;
            }
        }
        return true;
    }

    public boolean checkForWin() {
        if (columnCheck() || rowCheck() || diagonalWinLeftToRight() || diagonalWinRightToLeft()) {
            isGameWon = true;
        } else {
            isGameWon = false;
        }
        return isGameWon;
    }

    public void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
