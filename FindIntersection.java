import java.util.HashSet;
import java.util.Set;

class INTERSECTION {

    public static String FindIntersection(String[] strArr) {
        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");
        String result = "";
        Set<String> set = new HashSet<>();
        for (String s : arr1) {
            set.add(s);
        }
        for (String s : arr2) {
            if (set.contains(s)) {
                result += s + ",";

            }
        }
        if (result.length() == 0) {
            return "false";
        }
        strArr[0] = result.substring(0, result.length() - 1);


        return strArr[0];
    }

    public static void main (String[] args) {
        // keep this function call here
        String[] strAtt= {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(FindIntersection(strAtt));

    }

}