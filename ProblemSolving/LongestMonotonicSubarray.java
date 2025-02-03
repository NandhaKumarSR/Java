//3105. Longest Strictly Increasing or Strictly Decreasing Subarray
//Approach: Brute force

public class LongestMonotonicSubarray {
        public static int longestMonotonicSubarray(int[] nums) {
            int count = 1;
            int ptr = 1;
            for(int i =0; i< nums.length-1;i++){
                if(nums[i+1]>nums[i])
                ptr++;
                else
                ptr = 1;
    
                if(ptr > count)
                count = ptr;
            }
    
            int count2 = 1;
            int ptr2 = 1;
            for(int i =0; i < nums.length-1;i++){
                if(nums[i+1]<nums[i])
                ptr2++;
                else
                ptr2 = 1;
    
                if(ptr2 > count2)
                count2 = ptr2;
            }
            
            return count > count2 ? count : count2;
        }

        public static void main(String[] args) {
            System.out.println(longestMonotonicSubarray(new int[]{1,2,3}));
            
        }
    
    
}
