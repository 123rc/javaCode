import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solver(s));
    }

    private static String solver(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '.') {
                sb.append('0');
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                sb.append('1');
                i++;
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                sb.append('2');
                i++;
            }
        }

        return sb.toString();
    }
}
