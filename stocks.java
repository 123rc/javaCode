public class stocks {
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int n = prices.length;
        int buy=prices[0],profit=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];

            }
            else if(prices[i]-buy>profit)
            {
                profit=prices[i]-buy;
            }

        }

        System.out.println(profit);




    }
}

