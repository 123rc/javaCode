import java.util.HashMap;
import java.util.Scanner;

public class RomanInteger {
    public static void main(String[] args) {


        String s = "MCMXCIV";
       int val = 0,prev=0;
       for(char c:s.toCharArray())
       {
           switch (c)
           {
               case'I':
                   val+=1;
                   prev=1;
                   break;
               case'V':
                   val+=(prev==1)?3:5;
                   prev=5;
                   break;
               case'X':
                     val+=(prev==1)?8:10;
                     prev=10;
                     break;
                case'L':
                    val+=(prev==10)?30:50;
                    prev=50;
                    break;
                case'C':
                    val+=(prev==10)?80:100;
                    prev=100;
                    break;
                case'D':
                    val+=(prev==100)?300:500;
                    prev=500;
                    break;
                case'M':
                    val+=(prev==100)?800:1000;
                    prev=1000;
                    break;
           }
       }
        System.out.println(val);
    }
}
