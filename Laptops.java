import java.util.*;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Read prices and qualities of laptops and store them in the HashMap
        for(int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            mp.put(p, q);
        }

        // Store prices in an ArrayList and sort them
        ArrayList<Integer> prices = new ArrayList<>(mp.keySet());
        Collections.sort(prices);

        boolean happyAlex = false;

        // Check if there exists a pair of laptops satisfying Alex's condition
        for(int i = 0; i < prices.size() - 1; i++) {
            if(mp.get(prices.get(i)) > mp.get(prices.get(i + 1))) {
                happyAlex = true;
                break;
            }
        }

        // Output the result
        if(happyAlex) {
            System.out.println("Happy Alex");
        } else {
            System.out.println("Poor Alex");
        }
    }
}
