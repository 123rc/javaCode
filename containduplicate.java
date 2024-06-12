import java.util.HashMap;

public class containduplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean x = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) && i - hm.get(nums[i]) <= k) {
                x = true;
                break; // No need to continue checking if a duplicate within k distance is found
            } else {
                hm.put(nums[i], i);
            }
        }
        System.out.println(x);
    }
}
