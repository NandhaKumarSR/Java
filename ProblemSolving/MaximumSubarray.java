//53.Find the Maximum Subarray Sum
//Description:  kadane's Algorithm
public class MaximumSubarray {
        public static int maxSubArray(int[] nums) {
            int maxSum = nums[0];
            int sum = nums[0];
            for(int i = 0; i < nums.length; i++){
                sum = sum + nums[i];
                maxSum = sum > maxSum ? sum : maxSum;
                sum = sum < 0 ? 0 : sum;
            }
            return maxSum;
        }
        public static void main(String[] args) {
        
        int[] num = {1,2,3,5,-3};
        System.out.println(maxSubArray(num));
}
}
