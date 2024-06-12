import java.util.*;

public class nextgreater {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};
        int ans[]=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Building the map for finding the next greater element
        for(int i = 0; i < nums2.length; i++) {
            while(!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        // Finding next greater elements for nums1
        for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        // Printing the result
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
