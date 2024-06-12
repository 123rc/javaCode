import java.util.ArrayList;

public class finadALL {
    public static void main(String[] args) {
        int []nums={1,4,3,4,5,7,4};
        int k=4;
        System.out.println(solution(nums,k,0));

    }
    private static ArrayList<Integer> solution(int []nums,int k,int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==nums.length)
        {
            return list;
        }
        if(nums[index]==k)
        {
            list.add(index);
        }
        ArrayList<Integer>ansFromBelow = solution(nums,k,index+1);
        list.addAll(ansFromBelow);

        return list;
    }
}
