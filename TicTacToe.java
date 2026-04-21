public class TicTacToe {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {             
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // Print the character and a space
                System.out.print(board[row][col] + " ");
            }
            // After the inner loop finishes a row, print a new line
            System.out.println();
        }
    }
}