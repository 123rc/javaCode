public class symetric {
    public static void main(String[] args) {
        int low = 1, high = 100;
        int count = 0;

        for(int i = low; i <= high; i++) {
            if(isSymmetric(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isSymmetric(int num) {
        String s = String.valueOf(num);
        int sumfirsthalf = 0, secondhalf = 0;
        for(int i = 0; i < s.length() / 2; i++) {
            sumfirsthalf += s.charAt(i) - '0';
            secondhalf += s.charAt(s.length() - i - 1) - '0';
        }
        return sumfirsthalf == secondhalf;
    }
}
