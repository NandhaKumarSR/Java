//1470. Shuffle the Array
//Approach: Brute force, Skipping and copying elements to new array

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,6,5,4};
        nums = shuffle(nums, 3);
        for(int i: nums)
            System.out.println(i);        
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[2*n];
        for(int i = 0,j = 0; i<2*n;i+=2){
            shuffled[i] = nums[j++];
        }
        for(int i = 1,j = n; i<2*n;i+=2){
            shuffled[i] = nums[j++];
        }
        return shuffled;      
        
    }
    
}
