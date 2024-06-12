import java.util.Scanner;

public class SwitchingTVChannels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of TV channels, number of channels switched, initial channel, and target channel
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int U = sc.nextInt();

        // Calculate the number of button presses required in the forward direction
        int forwardPresses = (U > P) ? (U - P) / K + ((U - P) % K == 0 ? 0 : 1) : Integer.MAX_VALUE;

        // Calculate the number of button presses required in the backward direction
        int backwardPresses = (U < P) ? (P - U) / K + ((P - U) % K == 0 ? 0 : 1) : Integer.MAX_VALUE;

        // Choose the minimum number of button presses between forward and backward directions
        int minButtonPresses = Math.min(forwardPresses, backwardPresses);

        // Output the result
        System.out.println(minButtonPresses);
    }
}
