import java.util.Arrays;
import java.util.Scanner;

public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tasks[] = new int[m];
        for (int i = 0; i < m; i++) {
            tasks[i] = sc.nextInt();
        }

        System.out.println(solver(n, tasks));
    }

    private static long solver(int n, int[] tasks) {
        long time = 0;
        int curr = 1; // Start from house 1

        for (int i = 0; i < tasks.length; i++) {
            int destination = tasks[i];

            if (destination >= curr) {
                time += destination - curr;
            } else {
                time += n - curr + destination;
            }

            curr = destination; // Update current house
        }

        return time;
    }
}
