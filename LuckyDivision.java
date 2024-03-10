import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lucky[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        boolean x=false;
        for(int i=0;i<lucky.length;i++){
            if(n%lucky[i]==0){
                x=true;
                break;
            }
        }
        if(x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
