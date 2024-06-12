public class appendCharacters {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        System.out.println(solution(s, t));
    }

    private static int solution(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n == 0 || m == 0) {
            return 0;
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return m - j;
    }
}
