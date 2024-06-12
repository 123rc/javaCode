import java.util.HashSet;
import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            String s= sc.next();
            System.out.println(solver(s,n));

        }
    }

    private static int solver(String s, int n) {
        HashSet<Character> set=new HashSet<>();
        int prize=0;
        for(int i=0;i<n;i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                prize+=2;
            }
            else if (set.contains(s.charAt(i)))
            {
                prize++;
            }
        }
        return prize;
    }
}
