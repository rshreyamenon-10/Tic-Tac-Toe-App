import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        System.out.println("Board before computer move:");
        printBoard();
        
        computerMove();
        
        System.out.println("\nBoard after computer move:");
        printBoard();
    }

    static void computerMove() {
        Random random = new Random();
        boolean validMoveFound = false;

        while (!validMoveFound) {
            int slot = random.nextInt(9) + 1;
            
            int row = getRow(slot);
            int col = getCol(slot);

            if (isValidMove(row, col)) {
                board[row][col] = computerSymbol;
                validMoveFound = true;
                System.out.println("Computer selected valid slot: " + slot);
            }
        }
    }

    static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    static boolean isValidMove(int row, int col) {
        return board[row][col] == '-';
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}