import java.util.ArrayList;

public class graphs {
    public static void main(String[] args) {
        int v = 5;
        int e= 10;
        ArrayList<ArrayList<Integer>>ad=new ArrayList<>();
        for(int i=0;i<=v;i++) {
            ad.add(new ArrayList<>());
        }
        addEdge(ad, 1, 2);
        addEdge(ad, 1, 3);
        addEdge(ad, 2, 4);



    }
    private static void addEdge(ArrayList<ArrayList<Integer>> ad, int u, int v) {
        ad.get(u).add(v);
        ad.get(v).add(u);
    }
}
