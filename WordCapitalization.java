import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String b=s.charAt(0)+"";
        b=b.toUpperCase();
        System.out.println(b+s.substring(1));
    }
}
