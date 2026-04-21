public class Tic-Tac-Toe {
    // The board is a 2D array of characters
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    // Fills the board with empty dashes
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {             
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Prints the current state of the board to the console
    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}