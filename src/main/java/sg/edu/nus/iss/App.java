package sg.edu.nus.iss;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] tttBoard = new String[9];
        // Player X and O
        String player = "X";  // player to start first
        String winner = "";

        // Populate the tic tac toe board with 1 to 9
        for (int i = 0; i < tttBoard.length; i++) {
            tttBoard[i] = String.valueOf(i + 1);
        }

        TicTacToe ttt = new TicTacToe();
        ttt.printBoard(tttBoard);

        System.out.println("Tic Tac Toe Game");
        System.out.println("-----------------");
        System.out.println("X will play first.");

        Scanner scanner = new Scanner(System.in);

        while (winner == "") {
            // Play tic tac toe here...
            Integer input = scanner.nextInt();

            // only accept keyboad input 1 to 9
            if (input >= 1 && input <= 9) {

            }
            else {
                System.out.println("Please key in a number between 1 to 9!");
                continue;
            }

            // assign X or O to position if its number 
            if (tttBoard[input - 1].equals(String.valueOf(input))) {
                tttBoard[input - 1] = player; 

                // switch to another player's turn
                if (player.equalsIgnoreCase("X")) {
                    player = "O";
                    System.out.println("O will play now..");
                }
                else {
                    player = "X";
                    System.out.println("X will play now..");
                }
            }

            ttt.printBoard(tttBoard);
            winner = ttt.checkWinner(tttBoard);
            if (!winner.equals("")) {
                System.out.println("Winner is " + winner);
            }
        }

        scanner.close();
    }
}
