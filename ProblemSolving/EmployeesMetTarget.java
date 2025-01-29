//2798. Number of Employees Who Met the Target
//Approach: Brute force

public class EmployeesMetTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i<hours.length; i++)
            if(hours[i] >= target)
            count++;
        return count;        
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6};
        int n = 4;
        System.out.println(numberOfEmployeesWhoMetTarget(arr, n));
    }
    
}
