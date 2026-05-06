public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        
        while (!gameOver) {
            if (isHumanTurn) {
                humanMove();
            } else {
                computerMove();
            }

            if (checkWin() || checkDraw()) {
                gameOver = true;
                System.out.println("Game Over!");
            } else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }

    static void humanMove() {
        System.out.println("Human player's turn.");
    }

    static void computerMove() {
        System.out.println("Computer player's turn.");
    }

    static boolean checkWin() {
        return false; 
    }

    static int simulatedTurns = 0;
    
    static boolean checkDraw() {
        simulatedTurns++;
        if (simulatedTurns >= 3) {
            System.out.println("Draw detected.");
            return true;
        }
        return false;
    }
}