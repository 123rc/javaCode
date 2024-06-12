import java.util.PriorityQueue;

public class nearestpoint {
    public static int[][] main(String[] args) {
        int [][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        int res[][]=new int[k][2];
        PriorityQueue<int[]>pq=new PriorityQueue<>((x,y)->(x[0]*x[0]+x[1]*x[1])-(y[0]*y[0]+y[1]*y[1]));
        for(int p[]:points)
        {
            pq.offer(p);
        }
        for(int i=0;i<k;i++)
        {
            res[i]=pq.poll();
        }
        return res;
    }
}
