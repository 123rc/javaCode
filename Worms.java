import java.util.Scanner;

public class Worms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] juicy = new int[m];
        for (int i = 0; i < m; i++) {
            juicy[i] = sc.nextInt();
        }
        int sum[]=new int[n];
        sum[0]=piles[0];
        for(int i=1;i<n;i++)
        {
            sum[i]=sum[i-1]+piles[i];
        }
        for(int l:juicy)
        {
            int pile=solver(sum,l);
            System.out.println(pile);
        }


    }

    private static int solver(int[] sum, int l) {
        for(int i=0;i<sum.length;i++)
        {
            if(l<=sum[i])
            {
                return i+1;
            }
        }
        return -1;
    }
}
