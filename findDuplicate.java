import java.util.HashSet;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))return nums[i];
            set.add(nums[i]);
        }
        return -1;

    }
}
