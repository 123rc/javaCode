import java.util.Scanner;

public class Insomniac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(solver(k, l, m, n, d));




    }

    private static int solver(int k, int l, int m, int n, int d) {
        int n1= d / k;
        int n2= d / l;
        int n3= d / m;
        int n4= d / n;
        int count=n1-n2+n3-n4;
        return count;
    }
}
