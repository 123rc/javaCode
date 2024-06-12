public class firstMissingPositive {
    public static void main(String[] args) {
        int []nums={3,4,-1,1};
        int n=nums.length;
        System.out.println(solution(nums,n));
    }

    private static int solution(int[] nums, int n) {
        for(int i=0;i<n;i++)
        {
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i])
            {
                swap(nums,i,nums[i]-1);
            }

        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;


    }
    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
