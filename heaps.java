import java.util.ArrayList;
import java.util.PriorityQueue;

public class heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int nums[]={5,4,2,3};
        for(int i=0;i<nums.length;i++)
        {
            minHeap.add(nums[i]);
        }
        while(minHeap.size()>0)
        {
            int x=minHeap.poll();
            int y=minHeap.poll();
            arr.add(y);
            arr.add(x);
        }
        System.out.println(arr);
    }
}
