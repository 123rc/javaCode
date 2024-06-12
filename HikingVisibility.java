import java.util.Scanner;

public class HikingVisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Length of the hiking path and number of queries
        int N = scanner.nextInt();
        int q = scanner.nextInt();

        // Input: Elevations of positions on the hiking path
        int[] elevations = new int[N];
        for (int i = 0; i < N; i++) {
            elevations[i] = scanner.nextInt();
        }

        // Preprocessing: Calculate maximum elevation prefix
        int[] maxElevationPrefix = new int[N];
        maxElevationPrefix[0] = elevations[0];
        for (int i = 1; i < N; i++) {
            maxElevationPrefix[i] = Math.max(maxElevationPrefix[i - 1], elevations[i]);
        }

        // Query Processing
        for (int k = 0; k < q; k++) {
            int i = scanner.nextInt() - 1; // Adjust for 0-based indexing
            int j = scanner.nextInt() - 1; // Adjust for 0-based indexing

            // Calculate max elevation in the range [i, j]
            int maxElevationInRange = (i == 0) ? maxElevationPrefix[j] : Math.max(maxElevationPrefix[j], elevations[i]);

            // Check visibility
            if (Math.max(elevations[i], elevations[j]) > maxElevationInRange) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
