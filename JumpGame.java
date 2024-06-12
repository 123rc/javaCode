public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }

    private static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // If the current index is beyond the maximum reachable index,
                // it means we cannot reach the end.
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                // If we can reach the last index or beyond, we can stop early.
                return true;
            }
        }
        return false;
    }
}
