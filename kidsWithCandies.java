import java.util.ArrayList;
import java.util.Scanner;

public class kidsWithCandies {
    public static void main(String[] args) {
        int n, extraCandies;
        extraCandies = 3;
        int [] candies= {2,3,5,1,3};
        n = candies.length;
        int max = 0;
        for(int i: candies){
            max = Math.max(max, i);
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for(int i: candies){
            if(i+extraCandies >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        System.out.println(res);
    }
}
