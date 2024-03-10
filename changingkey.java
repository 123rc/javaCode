public class changingkey {
    public static void main(String[] args) {
        String a="AaAaAaaA";
        System.out.println(key(a));

    }

    private static int key(String a) {
        a=a.toLowerCase();
        int count=0;
        for(int i=1;i<a.length();i++)
        {
            if(a.charAt(i)!=a.charAt(i-1))
            {
                count++;
            }

        }
        return count;
    }
}
