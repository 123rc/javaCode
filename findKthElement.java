import java.util.ArrayList;
import java.util.Scanner;

public class findKthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                arr1.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                arr2.add(sc.nextInt());
            }

            System.out.println(solution(arr1, arr2, k));
        }
        sc.close();
    }

    private static int solution(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        int i = 0, j = 0;
        int count = 0;

        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }
}
