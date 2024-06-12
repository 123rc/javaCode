import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solution(x, n));

    }

    private static long solution(int x, int n) {
       if(n==0)
       {
           return 1;
       }
       if(x==0)
       {
           return 0;
       }
       return x*solution(x,n-1);

    }
}
