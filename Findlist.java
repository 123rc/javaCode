import java.util.ArrayList;
import java.util.List;

public class Findlist {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5};
        int k = 4;
        List<Integer> resultList = new ArrayList<>();
        System.out.println(solution(arr, k, 0, resultList));
    }

    private static List<Integer> solution(int[] arr, int k, int i, List<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == k) {
            list.add(i);
        }
        return solution(arr, k, i + 1, list);
    }
}
