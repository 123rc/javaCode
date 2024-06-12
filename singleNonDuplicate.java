public class singleNonDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid]==arr[mid+1])
            {
                mid=mid-1;
            }
            int left=(mid-low+1)%2;
            if(left==1)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }



        }
        return arr[low];
    }
}
