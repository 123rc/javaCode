import java.util.Scanner;
import java.util.Stack;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            int n=s.length();
            System.out.println(solution(s, n));
        }
        sc.close();
    }

    private static String solution(String s, int n) {
        char [] chars= new char[n];
        int i=-1;
        for(char c:chars)
        {
            if(i<0|| c!=chars[i])
            {
                chars[++i]=c;
            }
            else {
                i--;
            }
        }
        return new String(chars,0,i+1);

    }
}
