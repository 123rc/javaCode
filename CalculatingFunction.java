import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // Calculate the result based on the input number's parity
        long result = (n % 2 == 0) ? n / 2 : -(n + 1) / 2;

        System.out.println(result);
    }
}
