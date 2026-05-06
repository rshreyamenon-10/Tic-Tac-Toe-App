import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char humanSymbol = 'X';
    static char computerSymbol = 'O';
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        while (!gameOver) {
            if (isHumanTurn) {
                humanMove();
            } else {
                computerMove();
            }

            printBoard();

            char currentSymbol = isHumanTurn ? humanSymbol : computerSymbol;

            if (hasWon(currentSymbol)) {
                System.out.println((isHumanTurn ? "Human" : "Computer") + " wins!");
                gameOver = true;
            } else if (checkDraw()) {
                System.out.println("It's a draw!");
                gameOver = true;
            } else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }

    static void humanMove() {
        Scanner scanner = new Scanner(System.in);
        boolean validMoveFound = false;
        
        while (!validMoveFound) {
            System.out.print("Enter slot (1-9): ");
            int slot = scanner.nextInt();
            
            if (slot >= 1 && slot <= 9) {
                int row = getRow(slot);
                int col = getCol(slot);
                
                if (isValidMove(row, col)) {
                    board[row][col] = humanSymbol;
                    validMoveFound = true;
                } else {
                    System.out.println("Slot taken. Try again.");
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    static void computerMove() {
        System.out.println("Computer's turn...");
        Random random = new Random();
        boolean validMoveFound = false;

        while (!validMoveFound) {
            int slot = random.nextInt(9) + 1;
            int row = getRow(slot);
            int col = getCol(slot);

            if (isValidMove(row, col)) {
                board[row][col] = computerSymbol;
                validMoveFound = true;
                System.out.println("Computer selected slot: " + slot);
            }
        }
    }

    static boolean hasWon(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i] == symbol && board[i] == symbol && board[i] == symbol) {
                return true;
            }
            if (board[i] == symbol && board[i] == symbol && board[i] == symbol) {
                return true;
            }
        }

        if (board == symbol && board == symbol && board == symbol) {
            return true;
        }
        if (board == symbol && board == symbol && board == symbol) {
            return true;
        }

        return false;
    }

    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; 
                }
            }
        }
        return true;
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
        System.out.println();
    }
}