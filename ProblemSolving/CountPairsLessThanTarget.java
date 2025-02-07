//2824. Count Pairs Whose Sum is Less than Target
//Approach: bruteforce


import java.util.Arrays;
import java.util.List;

public class CountPairsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,5,25,15,30);
        System.out.println(countPairs(nums, 30));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i< nums.size();i++){
            for(int j = i+1; j < nums.size();j++){
                if(nums.get(i) + nums.get(j) < target)
                count++;
            }
        }
        return count;
    }
    
}
