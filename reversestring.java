public class reversestring {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        if(s==null || s.length()<=1)
        {
            return s;
        }
return solution(s.substring(1))+s.charAt(0);

    }
}
