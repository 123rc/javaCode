import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] citizens = new int[n];
        int min= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            citizens[i]=sc.nextInt();
            if(citizens[i]>min)
            {
                min=citizens[i];
            }

        }
        System.out.println(solver(min,citizens));


    }

    private static int solver(int min, int[] citizens) {
        int sum=0;
        for(int i=0;i<citizens.length;i++)
        {
            sum+=min-citizens[i];
        }
        return sum;
    }
}
