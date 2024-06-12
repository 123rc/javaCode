public class maximumOddBinaryNumber {
    public static void main(String[] args) {
        String s="0101";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for(char c:arr)
        {
            if(c=='1')
            {
                count++;
            }
        }
        arr[arr.length-1] ='1';
        count--;
        int i=0;
        for(int c=1;c<=count;c++)
        {
            arr[i++]='1';
        }
        for(int c=i;c<arr.length;c++)
        {
            arr[c]='0';
        }
        return String.valueOf(arr);



    }
}
