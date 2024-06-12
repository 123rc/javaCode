import java.util.*;

public class commonChars {
    public static void main(String[] args) {
        String[] A = {"bella", "label", "roller"};
        System.out.println(solution(A));
    }

    private static List<String> solution(String[] a) {
        List<String> res = new ArrayList<>();
int[] min = new int[26];
Arrays.fill(min, Integer.MAX_VALUE);
for(String s: a)
{
    int[] freq = new int[26];
    for(char c: s.toCharArray())
    {
        freq[c-'a']++;
    }
    for(int i=0;i<26;i++)
    {
        min[i] = Math.min(min[i], freq[i]);
    }

}


        return res;
    }
}
