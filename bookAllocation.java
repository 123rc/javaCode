public class bookAllocation {
    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int n=4;
        int m=2;
        System.out.println(solution(arr,n,m));

    }

    private static int solution(int[] arr, int n, int m) {
        long low=arr[0];
        long high=0;
        for(int i=0;i<n;i++)
        {
            high+=arr[i];
        }
        while(low<high)
        {
            long mid=low+(high-low)/2;
            if(isPossible(arr,n,m,mid))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return (int)low;
    }

    private static boolean isPossible(int[] arr, int n, int m, long mid) {
        int student=1,pages=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>mid)
            {
                return false;
            }
            if(pages+arr[i]>mid)
            {
                student++;
                pages=arr[i];
                if(student>m)
                {
                    return false;
                }
            }
            else
            {
                pages+=arr[i];
            }
        }
        return true;

    }
}