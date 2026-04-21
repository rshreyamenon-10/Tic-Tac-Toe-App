import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {
        Random random = new Random();
        
        int tossResult = random.nextInt(2);

        if (tossResult == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';    
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X'; 
        }
    }
    static void displayTossResult() {
        System.out.println("--- Tic-Tac-Toe Toss ---");
        
        if (isHumanTurn) {
            System.out.println("Result: Human starts the game!");
        } else {
            System.out.println("Result: Computer starts the game!");
        }
        
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("------------------------");
    }
}