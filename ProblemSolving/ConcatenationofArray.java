//1929. ConcatenationofArray

public class ConcatenationofArray {
    public static int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l * 2];
        for(int i = 0; i < l ; i++){
            ans[i]= nums[i];
            ans[i+l] = nums[i]; 
        }

        return ans;                
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] ans = getConcatenation(nums);
        for (int i : ans) {
            System.out.println(i);
        }    
    }
    
}
