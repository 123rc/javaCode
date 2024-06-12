import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            if (solver(nums)) {
                int swaps = 0;
                for (int i = 0; i < nums.length; i++) {
                    if ((i % 2 == 0 && nums[i] % 2 != 0) || (i % 2 != 0 && nums[i] % 2 == 0)) {
                        swaps += swap(nums[i], i);
                    }
                }
                System.out.println(swaps);
            } else {
                System.out.println(-1);
            }
        }
    }

    private static boolean solver(int[] nums) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                even++;
            } else if (i % 2 != 0 && nums[i] % 2 == 0) {
                odd++;
            }
        }
        return even == odd;
    }

    private static int swap(int a, int b) {
        return Math.abs(a - b) / 2; // Calculating the number of swaps needed
    }
}
