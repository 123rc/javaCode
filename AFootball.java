import java.util.Scanner;

public class AFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solver(s));
    }

    private static String solver(String s) {
        int ones = 0;
        int zeros = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                ones++;
                zeros = 0;
            } else {
                zeros++;
                ones = 0;
            }

            // Check if there are at least 7 consecutive players of the same team
            if (ones >= 7 || zeros >= 7) {
                return "YES";
            }
        }
        return "NO";
    }
}
