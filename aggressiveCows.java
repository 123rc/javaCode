import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int n=6,k=4;
        int[] stalls ={0,3 ,4, 7, 10, 9};
        System.out.println(solution(n,k,stalls));
    }

    private static int solution(int n, int k, int[] stalls) {
        Arrays.sort(stalls);

        int low=Integer.MAX_VALUE;
        int high=stalls[n-1]-stalls[0];
        for(int i=1;i<n;i++)
        {
            low=Math.min(low,stalls[i]-stalls[i-1]);
        }
        int ans=-1;
        while (low<=high)
        {
            int mid=low+(high-low)/2;

            if(helper(stalls,mid,k))
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;





    }

    private static boolean helper(int[] stalls, int mid, int k) {
        int count=1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-last>=mid)
            {
                count++;
                last=stalls[i];
            }
        }

        return count>=k;
    }
}
