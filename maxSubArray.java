public class maxSubArray {
    public static void main(String[] args) {
        int []nums = {2, -3, 4, -2, 2, 1, -1, 4};
        int maxSum = nums[0];
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
            maxSum = Math.max(maxSum, sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(maxSum);

    }
}
