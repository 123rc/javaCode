import java.util.Scanner;

public class Longtraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();

        // Calculate total time for one set in seconds
        int totalSetTime = m * 60 + s;

        // Calculate total break time between sets
        int totalBreakTime = (n - 1) * p;

        // Calculate total training time in seconds
        int totalTrainingTime = n * totalSetTime + totalBreakTime;

        // Convert total training time to minutes and seconds
        int minutes = totalTrainingTime / 60;
        int seconds = totalTrainingTime % 60;

        // Output the result
        System.out.println(minutes + " " + seconds);
    }
}
