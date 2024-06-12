import java.util.Arrays;
import java.util.Scanner;

public class PlusOneontheSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++)nums[i]= sc.nextInt();
            System.out.println(solver(nums));
        }
    }

    private static int  solver(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int count=max-nums[0];

        return count;
    }
}
