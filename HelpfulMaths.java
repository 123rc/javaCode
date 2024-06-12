import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sorter(s));

    }

    private static String sorter(String s) {
        String[] numbers = s.split("\\+");

        // Sort the numbers in non-decreasing order
        Arrays.sort(numbers);

        // Reconstruct the string with the sorted numbers
        StringBuilder sortedSum = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sortedSum.append(numbers[i]);
            if (i != numbers.length - 1) {
                sortedSum.append("+");
            }
        }

        return sortedSum.toString();
    }
}
