import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(solve(a, b, c));

    }

    private static int solve(int a, int b, int c) {
        int max=0;
        int add = a+b+c;
        int mul = a*b*c;
        int addmul = a+b*c;
        int muladd = a*b+c;
        int bracket1 = a*(b+c);
        int bracket2 = (a+b)*c;
        max = Math.max(add, Math.max(mul, Math.max(addmul, Math.max(muladd, Math.max(bracket1, bracket2)))));



        return max;
    }
}
