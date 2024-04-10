package VJudge;

import java.util.ArrayList;
import java.util.Scanner;

public class ChessMove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < t; i++) {
            String position = scanner.nextLine();
            ArrayList<String> moves = calculateRookMoves(position);
            for (String move : moves) {
                System.out.println(move);
            }
        }
    }

    public static ArrayList<String> calculateRookMoves(String position) {
        ArrayList<String> moves = new ArrayList<>();
        char column = position.charAt(0);
        char row = position.charAt(1);

        // Horizontal moves
        for (char c = 'a'; c <= 'h'; c++) {
            if (c != column) {
                moves.add("" + c + row);
            }
        }

        // Vertical moves
        for (char r = '1'; r <= '8'; r++) {
            if (r != row) {
                moves.add("" + column + r);
            }
        }

        return moves;
    }
}
