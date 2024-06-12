import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println(solution(c));
    }

    private static double [] solution(double c) {
        double f= c*1.8+32;
        double k= c+273.15;
        return new double[]{f,k};
    }
}
