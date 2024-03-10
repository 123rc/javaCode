
import java.util.Map;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Map<String,Integer> map = new java.util.HashMap<>();
        for(int i=0;i<n;i++){
            String s=sc.next();
            map.put(s,map.getOrDefault(s,0)+1);


            }
        int max=0;
String ans="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                ans=entry.getKey();

            }

        }
        System.out.println(ans);



    }
}
