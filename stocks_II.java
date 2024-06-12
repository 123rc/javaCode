public class stocks_II {
    public static void main(String[] args) {
        int []prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int profit = 0, buy = prices[0];
        for(int i=1;i<n;i++)
        {
            if(buy<prices[i])
            {
                profit+=prices[i]-buy;

            }
            buy=prices[i];


        }
        System.out.println(profit);


    }
}
