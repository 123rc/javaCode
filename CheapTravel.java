import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solver(n, m, a, b));
    }

    private static int solver(int n, int m, int a, int b) {
        int cost=0;
        int ind=n*a;
        int temp=n/m;
        int bun=temp*b;
        int rem=(n%m)*a;
        return Math.min(ind,bun+Math.min(rem,b));

           }
}
