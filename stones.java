import java.util.Comparator;
import java.util.PriorityQueue;

public class stones {
    public static void main(String[] args) {
        int [] stones = {2,7,4,1,8,1};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            maxHeap.offer(stones[i]);
        }
        while(maxHeap.size()!=1&& !maxHeap.isEmpty())
        {
            int x=maxHeap.poll();
            int y=maxHeap.poll();
            if(x!=y)
            {
                maxHeap.offer(Math.abs(y-x));
            }
            if(maxHeap.size()==0)
            {
                System.out.println(maxHeap.peek());
            }
        }

    }
}
