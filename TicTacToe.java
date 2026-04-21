public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        int testRow = 1;
        int testCol = 1;

        if (isValidMove(testRow, testCol)) {
            System.out.println("Move accepted!");
            board[testRow][testCol] = 'X'; 
        } else {
            System.out.println("Move rejected!");
        }
    }

    static boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (board[row][col] == '-') {
                return true; 
            } else {
                System.out.println("Error: Cell is already occupied.");
                return false;
            }
            
        } else {
            System.out.println("Error: Move is out of bounds (must be 0-2).");
            return false;
        }
    }
}