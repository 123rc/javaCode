public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(solution(arr, k, 0));

    }
    private static boolean solution(int[] arr,int k,int index)
    {

       if(index==arr.length)
       {
           return true;
       }
       return arr[index]==k||solution(arr,k,index+1);

    }
}
