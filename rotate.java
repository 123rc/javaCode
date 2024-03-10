import java.util.ArrayList;

public class rotate {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();

        arr.add(9);
        arr.add(8);
        arr.add(4);
        arr.add(9);
        arr.add(8);
        arr.add(8);
        arr.add(9);
        arr.add(7);
        arr.add(7);
        arr.add(9);
        arr.add(4);
        arr.add(2);
        arr.add(5);
        arr.add(0);
        arr.add(2);
        arr.add(7);
        arr.add(9);
        arr.add(0);
        arr.add(4);
        arr.add(9);
        arr.add(7);
        arr.add(3);
        arr.add(9);
        arr.add(2);
        arr.add(9);
        arr.add(6);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(0);
        arr.add(9);




            System.out.println(increment(arr));


    }

    private  static ArrayList<Integer> increment(ArrayList<Integer> arr ) {
        long s=0;
        for(int i:arr)
        {
            s=s*10+i;
        }
        s=s+1;
        ArrayList<Integer> res=new ArrayList<>();
        while(s>0)
        {
            res.add(0, (int) (s%10));
            s=s/10;
        }
        return res;

        // code here
    }

}
