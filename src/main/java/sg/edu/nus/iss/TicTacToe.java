package sg.edu.nus.iss;

import java.util.Arrays;

public class TicTacToe {
    
    public void printBoard(String[] board) {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public String checkWinner(String[] board) {

        // Winners are (1,2,3), (4,5,6), (7,8,9), (1,4,7), (2,5,8), (3,6,9), (1,5,9), (3,5,7)

        String line = "";
        String winner = "";

        Integer i = 0;
        while (i < 8) {
            switch(i) {
                case 0: line = board[0] + board[1] + board[2];
                    break;
                case 1: line = board[3] + board[4] + board[5];
                    break;
                case 2: line = board[6] + board[7] + board[8];
                    break;
                case 3: line = board[0] + board[3] + board[6];
                    break;
                case 4: line = board[1] + board[4] + board[7];
                    break;
                case 5: line = board[2] + board[5] + board[8];
                    break;
                case 6: line = board[0] + board[4] + board[8];
                    break;
                case 7: line = board[2] + board[4] + board[6];
                    break;
            }

            i++;

            if (line.equalsIgnoreCase("XXX")) {
                winner = "X";
                i = 9;  // kill the while loop
            }
            else if (line.equalsIgnoreCase("OOO")) {
                winner = "O";
                i = 9;  // kill the while loop
            }
            else {
                for (int a = 0; a < 9; a++) {
                    if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                        break;
                    }
                    else if (a == 8) {
                        winner = "draw";
                    }
                }
            }
        }

        return winner;
    }
}
