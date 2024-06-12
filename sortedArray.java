public class sortedArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,100,7,8,9,10};
        int n =0;
        if(solution(arr,n))
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }

    private static boolean solution(int[] arr, int index) {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1]&&solution(arr,index+1) ;



    }
}
