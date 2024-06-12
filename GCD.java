public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        if(a%b==0)
        {
            return b;
        }
        return solution(b,a%b);

    }
}
