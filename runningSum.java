public class runningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        // Calculate running sum
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        // Display the running sum
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
}
