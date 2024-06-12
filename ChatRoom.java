import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solver(s) ? "YES" : "NO");
    }

    private static boolean solver(String s) {
        String org="hello";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==org.charAt(j))
            {
                j++;
                if(j==5)
                {
                    return true;
                }
            }

        }
        return false;

    }
}
