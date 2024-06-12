public class trappingwater {
    public static void main(String[] args) {
        int []height =new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int rmax=Integer.MIN_VALUE,lmax=Integer.MIN_VALUE,right=height.length-1,left=0,s=0;
        while(left<right)
        {
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
            s += (lmax < rmax) ? lmax - height[left++] : rmax - height[right--];
        }
        System.out.println(s);

    }
}
