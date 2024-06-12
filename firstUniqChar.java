public class firstUniqChar {
    public static void main(String[] args) {
        String s= "loveleetcode";
        System.out.println(solver(s));
    }

    private static int solver(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)return i;
        }
        return -1;

    }
}
