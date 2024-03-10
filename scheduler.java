public class scheduler {
    public static void main(String[] args) {
        char[]tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int[] freq =new int[26];
        for(char t:tasks)
        {
            freq[t-'A']++;
        }

    }
}
