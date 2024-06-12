import java.util.Arrays;

public class maxWidthOfVerticalArea {
    public static void main(String[] args) {
        int [][] points = {{8,7},{9,9},{7,4},{9,7}};
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int max = 0;
        for(int i=1; i<points.length; i++){
            max = Math.max(max, points[i][0] - points[i-1][0]);
        }
        System.out.println(max);

    }

}
