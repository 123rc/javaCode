import java.util.Scanner;

public class EntertainmentinMAC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0;i<n;i++)
        {
            int t=sc.nextInt();
            String s=sc.next();
            String res=new StringBuilder(s).reverse().toString();
            System.out.println(minstring(s,res));
        }
    }

    private static String minstring(String s, String res) {
        return s.compareTo(res+s)<0?s:res+s;
    }
}
