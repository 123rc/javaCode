import java.util.Hashtable;

public class majorityelement {
    public static void main(String[] args) {
        int []nums={3,2,3};
        int n=nums.length;
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int count=0;
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for(int i:nums){
            if(ht.containsKey(i)){
                ht.put(i,ht.get(i)+1);
            }else{
                ht.put(i,1);
            }
        }

        for(int i:ht.keySet()){
            if(ht.get(i)>nums.length/2){
                count=i;
            }
        }
        return count;
    }
}
