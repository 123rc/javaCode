public class findLargestMinDistance {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 6, 2, 3};
        int k=2;
        System.out.println(solution(arr,k));
    }

    private static int solution(int[] arr, int k) {
        int low=arr[0];
        int high=0;
        for(int i=0;i< arr.length;i++)
        {
            high+=arr[i];
        }
        while (low<high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(arr,mid,k))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }


        return low;
    }

    private static boolean isPossible(int[] arr, int mid, int k) {
        int painter=1,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>mid)
            {
                return false;
            }
            if(sum+arr[i]>mid)
            {
                painter++;
                sum=arr[i];
                if(painter>k)
                {
                    return false;
                }
            }
            else
            {
                sum+=arr[i];
            }

        }
        return true;
    }
}
