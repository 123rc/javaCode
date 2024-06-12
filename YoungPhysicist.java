import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0, z = 0;
        int arr[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            x += arr[i][0];
            y += arr[i][1];
            z += arr[i][2];
        }
        if (x == 0 && y == 0 && z == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
