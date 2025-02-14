//1342. Number of Steps to Reduce a Number to Zero
//Approach: Brute force


public class NumberOfStepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(111));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0){
            if(num % 2 == 0)
            num/=2;
            else
            num-=1;

            count++;
        }
        return count;
    }
    
}
