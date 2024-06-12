import java.util.Scanner;

public class dogpark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.next().toCharArray();

        }
        int res[]=findtheDog(arr);
        System.out.println(res[0]+" "+res[1]);

    }

    private static int[] findtheDog(char[][] arr) {
        int tall=-1;
        int tallIndex[]={0,0};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(Character.isDigit(arr[i][j]))
                {
                   int h=arr[i][j];
                     if(h>tall)
                     {
                          tall=h;
                          tallIndex[0]=i;
                          tallIndex[1]=j;
                     }
                }
            }
        }
        return tallIndex;
    }
}
