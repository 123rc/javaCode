import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        int[] nums = new int[]{16, 0, 23, 8, 15, 42, 1, 2};
        int target = 1;

        Solution solutionObject = new Solution();
        int[] result = solutionObject.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        } else {
            System.out.println("No result found.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        // If no result is found
        return new int[]{};
    }
}
