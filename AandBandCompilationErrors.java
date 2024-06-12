import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class AandBandCompilationErrors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] first = new int[n];
        for (int i = 0; i < n; i++)
            first[i] = sc.nextInt();
        int[] second = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            second[i] = sc.nextInt();
        int[] third = new int[n - 2];
        for (int i = 0; i < n - 2; i++)
            third[i] = sc.nextInt();
        System.out.println(solver(first, second, third));
    }

    private static String solver(int[] first, int[] second, int[] third) {
        Arrays.sort(first);
        Arrays.sort(second);
        Arrays.sort(third);

        int a = -1, b = -1;

        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1 || first[i] != second[i]) {
                a = first[i];
                break;
            }
        }

        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1 || second[i] != third[i]) {
                b = second[i];
                break;
            }
        }

        return a + " " + b;
    }
}
