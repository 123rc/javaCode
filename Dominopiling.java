import java.util.Scanner;

public class Dominopiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solver(m, n));
    }

    private static int solver(int m, int n) {
        return (int) Math.floor((m * n) * 0.5);
    }
}
