import java.util.Scanner;

public class Mitosis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(solution(a,b,c))
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static boolean solution(int a, int b, int c) {
        if(c==a+b)return true;
        return false;
    }
}
