public class longestsubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int count=0;
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(a==b)
            {
                break;
            }
            else{
                count++;
            }
            if(count>max){
                max=count;
            }

        }
        System.out.println(max);
    }
}
