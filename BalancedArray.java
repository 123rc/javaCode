import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-- > 0) {
               int n = sc.nextInt();
               if (n % 4 != 0) {
                   System.out.println("NO");
               } else {
                   System.out.println("YES");
                   for (int i = 2; i <= n; i += 2) {
                       System.out.print(i + " ");
                   }
                   for (int i = 1; i < n - 2; i += 2) {
                       System.out.print(i + " ");
                   }
                   System.out.println(n + (n / 2 - 1));
               }
           }

    }
}
