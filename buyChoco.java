import java.util.Arrays;

public class buyChoco {
    public static void main(String[] args) {
        int []prices = {1, 2, 2};
        int money = 3;
System.out.println(solution(prices, money));

    }

    private static int solution(int[] prices, int money) {
        Arrays.sort(prices);
        int sum= prices[0]+prices[1];
        if(sum>money)
        {
            return money;
        }
        return money-sum;
    }
}
