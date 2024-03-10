public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] result = productExceptSelf(nums);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int prefix = 1;
        for(int i=0;i<n;i++)
        {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i=n-1;i>=0;i--)
        {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;

    }

}
