public class triangle {
    public static void main(String[] args) {
       int [] nums = {8,4,4};
         System.out.println(typeoftriangle(nums));
    }

    private static String typeoftriangle(int[] nums) {
        if(nums.length<3)
        {
            return "0";
        }
        if(nums.length==3)
        {
           if(nums[0]==nums[1]&&nums[1]==nums[2])
           {
               return "equalateral";
           }
           else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2])
           {
               return "isosceles";
           }
           else if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2])
           {
               if(nums[0]+nums[1]>nums[2]&&nums[1]+nums[2]>nums[0]&&nums[0]+nums[2]>nums[1])
               {
                   return "scalene";
               }

           }
        }
        return "0";

    }
}
