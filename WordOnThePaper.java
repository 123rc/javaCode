import java.util.Scanner;

public class WordOnThePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder(); // Store letters within a test case
            for (int j = 0; j < 8; j++) {
                String row = sc.next();
                sb.append(solver(row)); // Append letters for each row
            }
            System.out.println(sb.toString()); // Print the complete word for the test case
        }

        sc.close();
    }

    private static String solver(String row) {
        StringBuilder sb = new StringBuilder();
        for (char ch : row.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
