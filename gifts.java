import java.util.Comparator;
import java.util.PriorityQueue;

public class gifts {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int [] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        for(int i=0;i<gifts.length;i++)
        {
            maxHeap.offer(gifts[i]);
        }
        int i=0, sum=0;
        while(i<k)
        {
            maxHeap.offer((int)Math.sqrt(maxHeap.poll()));
            i++;
        }
        while(maxHeap.size()>0)
        {
            sum+=maxHeap.poll();
        }
        System.out.println(sum);



    }
}
