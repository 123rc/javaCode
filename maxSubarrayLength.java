import java.util.HashMap;
import java.util.Map;

public class maxSubarrayLength {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int n = nums.length;
        int k = 3;
        System.out.println(solution(nums, n, k));
    }

    private static int solution(int[] nums, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int maxElement = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= k) {
                maxElement = Math.max(maxElement, entry.getKey());
            }
        }
        return maxElement;
    }
}
