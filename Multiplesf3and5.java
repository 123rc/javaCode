import java.util.Scanner;

public class Multiplesf3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the values of t and n
        System.out.print("Enter the number of test cases (t): ");
        int t = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int sum = getSum(n);
            System.out.println("Sum of multiples of 3 and 5 up to " + n + ": " + sum);
        }
    }

    private static int getSum(int n) {
        // Calculate the sum of multiples of 3
        int sumOf3 = sumOfMultiples(n, 3);
        // Calculate the sum of multiples of 5
        int sumOf5 = sumOfMultiples(n, 5);
        // Subtract the sum of multiples of 15 to avoid double-counting
        int sumOf15 = sumOfMultiples(n, 15);
        return sumOf3 + sumOf5 - sumOf15;
    }

    private static int sumOfMultiples(int n, int divisor) {
        // Calculate the number of multiples of 'divisor' up to 'n'
        int numOfMultiples = (n - 1) / divisor;
        // Calculate the sum of multiples using the sum of an arithmetic series formula
        return divisor * numOfMultiples * (numOfMultiples + 1) / 2;
    }
}
