public class findPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        while(low<high)
        {
            int mid = low + (high - low) / 2;
            if(nums[mid]<nums[mid+1]) {
                low = mid + 1;
            }
            else
            {
                high=mid;
            }
        }
        return low;
    }
}
