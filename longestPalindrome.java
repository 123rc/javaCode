import java.util.HashMap;

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int count=0;
        boolean odd = false;
        for(int i: map.values())
        {
            if(i%2==0)
            {
                count+=i;
            }
            else {
                count+=i-1;
                odd = true;
            }
        }
        return odd?count+1:count;

    }
}
