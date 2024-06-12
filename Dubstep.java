import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String song=sc.nextLine();
        System.out.println(song.replaceAll("WUB"," ").trim());
    }
}
