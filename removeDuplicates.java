public class removeDuplicates {
    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int n = nums.length;
        System.out.println(solution(nums));
        



    }

    private static int solution(int[] nums) {
        int t=1,count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[t]==nums[i])
            {
                if(count<2)
                {
                    count++;
                    nums[++t]=nums[i];
                }
                else {
                    count=1;
                    nums[++t]=nums[i];


                }
            }
        }
        return ++t;


    }
}
