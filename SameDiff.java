import java.util.HashMap;
import java.util.Scanner;

public class SameDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=  sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            int nums[]=new int[n];
            for(int j=0;j<n;j++)nums[j]= sc.nextInt();
            System.out.println(solver(nums));
        }
    }

    private static long solver(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long count=0;
        for(int i=0;i<nums.length;i++)
        {
            int diff=nums[i]-i;
            count+=map.getOrDefault(diff,0);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return count;
    }
}
