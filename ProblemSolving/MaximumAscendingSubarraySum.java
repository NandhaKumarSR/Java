//1800. Maximum Ascending Subarray Sum
//Approach: Linear time complexity O(n)

public class MaximumAscendingSubarraySum {
    public static int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int ptr = nums[0];
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1])
            ptr += nums[i+1];
            else
            ptr = nums[i+1];

            if(ptr > sum)
            sum = ptr;
        }       
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{10,20,20,100}));
    }
    
}
