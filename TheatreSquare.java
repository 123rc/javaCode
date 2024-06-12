import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        long len=n/a;
        if(n%a!=0)
            len++;
        long bre=m/a;
        if(m%a!=0)
            bre++;
        System.out.println(len*bre);


    }
}