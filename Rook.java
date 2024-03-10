import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for(int i = 0; i < t; i++) {
            String square = sc.nextLine().trim();
            List<String> moves = solver(square);
            for (String move : moves) {
                System.out.println(move);
            }
        }
        sc.close();
    }

    private static List<String> solver(String square) {
        List<String> result = new ArrayList<>();
        char col = square.charAt(0);
        int row = Integer.parseInt(square.substring(1));
        for(int i = 1; i <= 8; i++) {
            if (i != row) {
                result.add(Character.toString(col) + Integer.toString(i));
            }
        }
        for(char c = 'a'; c <= 'h'; c++) {
            if (c != col) {
                result.add(Character.toString(c) + Integer.toString(row));
            }
        }
        return result;
    }
}
