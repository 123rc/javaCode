public class JumpGame_II {
    public static void main(String[] args) {
        int []nums = {2,3,0,1,4};
        int n = nums.length;
        System.out.println(solution(nums,n));
    }

    private static int solution(int[] nums, int n) {
        int max = 0, count = 1;
        for (int i = 0; i < n; i++) {
            if (i > max) count++;
            max = Math.max(max, i + nums[i]);
            if (max >= n - 1) {
                count++;
                return count;


            }

        }

        return 0;
    }
}
