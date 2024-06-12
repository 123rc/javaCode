import java.util.Scanner;

public class NeuralNetwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        System.out.println(solution(nodes));
    }

    private static int solution(int[] nodes) {
        int sum = 0;
        for (int i = 0; i < nodes.length - 1; i++) {
            int edges = nodes[i] * nodes[i + 1];
            sum += edges;
        }
        return sum;
    }
}
