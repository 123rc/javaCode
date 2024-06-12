import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            sum += coins[i]; // Calculate the sum while reading the coin values
        }
        System.out.println(solver(coins, sum));
    }

    private static int solver(int[] coins, int sum) {
        Arrays.sort(coins); // Sort the coins array in ascending order
        int mySum = 0;
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) { // Iterate in reverse order (from largest to smallest)
            mySum += coins[i];
            count++;
            if (mySum > sum / 2) { // If mySum becomes greater than half of the total sum
                break; // Stop the loop
            }
        }
        return count;
    }
}
