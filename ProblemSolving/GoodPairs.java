//1512. Number of Good Pairs
//Approach: Brute Force

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length;i++)
            for(int j=i+1; j<nums.length;j++)
                if(nums[i]==nums[j])
                    count++;
        return count;
        
    }
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,1,3,2}));
    } 
}
