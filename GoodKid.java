import java.util.Arrays;
import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.println(solver(arr,n));
        }
    }

    private static int solver(int[] arr, int n) {
        int max = product(arr, n);

        for (int i = 0; i < n; i++) {
            int[] newArr = Arrays.copyOf(arr, n); // Create a copy of the original array
            newArr[i]++; // Increment one element
            max = Math.max(max, product(newArr, n)); // Calculate product and update max
        }
        return max;
    }

    private static int product(int arr[],int n)
    {
        int product=1;
        for(int i=0;i<n;i++)
        {
            product=product*arr[i];
        }
        return product;
    }
}
