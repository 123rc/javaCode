import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);

        // Print the result
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }

        return ans;
    }
}
