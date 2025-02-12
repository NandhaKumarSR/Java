//2342. Max Sum of a Pair With Equal Sum of Digits
//Approach: HashMap

import java.util.HashMap;
import java.util.Map;

public class MaxSumPairWithSameDigitSum {

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{10,1,21,30}));      
    }
    public static int maximumSum(int[] nums) {
        Map<Integer, int[]> sumToMaxPair = new HashMap<>();
        
        for (int num : nums) {
            int sum = sumOfDigits(num);
            if (!sumToMaxPair.containsKey(sum)) {
                sumToMaxPair.put(sum, new int[]{num, -1});
            } else {
                int[] pair = sumToMaxPair.get(sum);
                if (num > pair[0]) {
                    pair[1] = pair[0];
                    pair[0] = num;
                } else if (num > pair[1]) {
                    pair[1] = num;
                }
            }
        }
        
        int maxSum = -1;
        for (int[] pair : sumToMaxPair.values()) {
            if (pair[1] != -1) {
                maxSum = Math.max(maxSum, pair[0] + pair[1]);
            }
        }
        
        return maxSum;
    }
    
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}