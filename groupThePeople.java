import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupThePeople {
    public static void main(String[] args) {
        int []groupSizes={3,3,3,3,3,1,3};
        System.out.println(solution(groupSizes));
    }

    private static List<List<Integer>> solution(int[] groupSizes) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            int size=groupSizes[i];
            int per=i;
            List<Integer> group=map.getOrDefault(size,new ArrayList<>());
            group.add(per);
            map.put(size,group);
            if(group.size()==size)
            {
                res.add(group);
                map.remove(size);
            }

        }

        return res;
    }
}
