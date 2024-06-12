import java.util.Arrays;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int s = sc.nextInt();
            int n = sc.nextInt();

            int[][] dragons = new int[n][2];
            for (int i = 0; i < n; i++) {
                dragons[i][0] = sc.nextInt();
                dragons[i][1] = sc.nextInt();
            }

            Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));

            boolean canDefeat = true;
            for (int i = 0; i < n; i++) {
                if (s <= dragons[i][0]) {
                    canDefeat = false;
                    break;
                } else {
                    s += dragons[i][1];
                }
            }

            System.out.println(canDefeat ? "YES" : "NO");
        }

        sc.close();
    }
}
