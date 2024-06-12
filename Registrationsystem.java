import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registrationsystem {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            String s= sc.next();
            if(map.containsKey(s))
            {
                System.out.println(s+map.get(s));
                map.put(s, map.get(s)+1);
            }
            else
            {
                System.out.println("OK");
                map.put(s, 1);
            }
        }

    }
}
