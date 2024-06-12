import java.util.Scanner;

public class kthChildNthGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(solution(n, k));
        }
    }

    private static char solution(int n, int k) {
        if(n==1)return 'M';
        char parent = solution(n-1,(k+1)/2);
        if(parent=='M')
        {
            return k%2==1?'M':'F';

        }
        else {
            return k%2==1?'F':'M';
        }
    }
}
