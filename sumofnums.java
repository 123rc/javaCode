public class sumofnums {
    public static void main(String[] args) {
        int x=5;
        System.out.println(solution(x));
    }

    private static int solution(int x) {

        if(x!=0)
        {
            return x+solution(x-1);
        }
        else {
            return x;
        }
    }
}
