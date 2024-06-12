public class reverseStringgg {
    public static void main(String[] args) {
        char a[]= {'h','e','l','l','o'};
        solution(a);
        for(char c:a)
        {
            System.out.print(c+" ");
        }
    }

    private static void solution(char[] a) {
        int start=0,end=a.length-1;
        while(start<end)
        {
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }


    }
}
