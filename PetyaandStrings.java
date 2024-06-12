import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // Compare strings lexicographically ignoring case
        int result = a.compareToIgnoreCase(b);

        // Print the result based on comparison
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
