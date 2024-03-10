class Main {
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 7, 8};
        Solution solutionObject = new Solution();
        int[] result = solutionObject.productExceptSelf(nums);

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] res = new int[nums.length];
            int[] left = new int[nums.length];
            int[] right = new int[nums.length];
            left[0] = 1;

            for (int i = 1; i < nums.length; i++) {
                left[i] = nums[i - 1] * left[i - 1];
            }

            right[nums.length - 1] = 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                right[i] = nums[i + 1] * right[i + 1];
            }

            for (int i = 0; i < nums.length; i++) {
                res[i] = left[i] * right[i];
            }

            return res;
        }
    }
}
