import java.util.Scanner;

public class LexicographicallyLargestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            System.out.println(findLexicographicallyLargestString(s, n));
        }
        scanner.close();
    }

    private static String findLexicographicallyLargestString(String s, int n) {
        StringBuilder result = new StringBuilder();
        int left = 0, right = n - 1;

        while (left <= right) {
            // If both characters are '1', remove them
            if (s.charAt(left) == '1' && s.charAt(right) == '1') {
                left++;
                right--;
            }
            // If both characters are '0', remove them
            else if (s.charAt(left) == '0' && s.charAt(right) == '0') {
                left++;
                right--;
            }
            // Otherwise, append the current character to the result
            else {
                result.append(s.charAt(left));
                left++;
            }
        }

        // Append the remaining characters from the left pointer
        while (left < n) {
            result.append(s.charAt(left));
            left++;
        }

        return result.toString();
    }
}
