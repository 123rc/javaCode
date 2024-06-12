import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of students
        int m = sc.nextInt(); // Number of puzzles
        int[] arr = new int[m]; // Array to store puzzle pieces

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int diff = arr[i + n - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        System.out.println(minDiff);
    }
}
