//3264. Final Array State After K Multiplication Operations I
//Approach: Brute force

public class ArrayAfterOperations {

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++){
            int min = nums[0];

            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] < min)
                min = nums[j];
            }

            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] == min){
                nums[j] *= multiplier;
                break;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = getFinalState(new int[]{1,4,7,16,3},4, 6);

        for (int i : arr) {
            System.out.println(i);            
        }
    }
}