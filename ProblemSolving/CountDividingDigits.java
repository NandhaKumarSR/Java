//2520. Count the Digits That Divide a Number

public class CountDividingDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(399));        
    }
    public static int countDigits(int num) {
        int numCopy  = num;
        int divisors = 0;
        while(numCopy != 0){
            if(num % (numCopy%10) == 0)
            divisors++;
            numCopy/=10;
        }
        return divisors;
    }
}
