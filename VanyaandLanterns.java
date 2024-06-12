import java.util.Arrays;
import java.util.Scanner;

public class VanyaandLanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int lanterns[] = new int[n];
        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt();
        }
        System.out.println(solver(lanterns, l));
    }

    private static double solver(int[] lanterns, int l) {
        Arrays.sort(lanterns);
        double max = 0;
        for (int i = 0; i < lanterns.length - 1; i++) {
            max = Math.max(max, lanterns[i + 1] - lanterns[i]);
        }
        double first = lanterns[0];
        double last = l - lanterns[lanterns.length - 1];
        double ans = Math.max(max / 2, Math.max(first, last));
        return  ans;



    }
}
