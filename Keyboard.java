import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        String keys="qwertyuiopasdfghjkl;zxcvbnm,./";
        Scanner sc = new Scanner(System.in);
        String comm = sc.next();
        String word = sc.next();
        System.out.println(solver(keys, comm, word));



    }

    private static String solver(String keys, String comm, String word) {
        StringBuilder sb=new StringBuilder();
        if(comm.equals("R"))
        {
            for(int i=0;i<word.length();i++)
            {
                int index=keys.indexOf(word.charAt(i));
                sb.append(keys.charAt(index-1));
            }
        }
        else
        {
            for(int i=0;i<word.length();i++)
            {
                int index=keys.indexOf(word.charAt(i));
                sb.append(keys.charAt(index+1));
            }
        }
        return sb.toString();
    }
}
