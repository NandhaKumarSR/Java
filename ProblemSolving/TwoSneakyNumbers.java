//3289. The Two Sneaky Numbers of Digitville
//Approach: Sorting

import java.util.Arrays;

public class TwoSneakyNumbers {
    public static void main(String[] args) {
        System.out.println(""+getSneakyNumbers(new int[]{10,20,40,40,50,50})[0]+" "+ getSneakyNumbers(new int[]{10,20,40,40,50,50})[1]);
    }
    public static int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] sneakyNums = new int[2];
        for(int i = 0,j = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1])
            sneakyNums[j++] = nums[i];
        }
        return sneakyNums;
    }
}
