//1920. Build Array from Permutation

public class ArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[nums[i]];
        }
        return a;
    }

    public static void main(String[] args) {
        // Updated array with valid permutation values
        int[] a = {1, 2, 3, 4, 0}; 
        int[] ans = buildArray(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);  
        }
    }
}
