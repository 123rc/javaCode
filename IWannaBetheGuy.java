import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class IWannaBetheGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Integer> res=new HashSet<>();
        int i=0;
        while(i<n){
            int t= sc.nextInt();
            res.add(t);
            i++;
        }
        int j=0;
        while(j<n){
            int t= sc.nextInt();
            res.add(t);
            j++;
        }
        if(res.size()==n)
        {
            System.out.print( "I become the guy.");
        }
        else
        {
            System.out.print( "Oh, my keyboard!");
        }



    }
}
