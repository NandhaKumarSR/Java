//2427. Number of common factors: Leetcode
//Description:  Bruteforce approach as the constrains are between 1 and thousand
import java.util.Scanner;



public class CommonFactors {
    public static int commonFactors(int a, int b) {
        int minNumber;
        int count = 0;
        if(a<b)
        minNumber = a;
        else
        minNumber = b;
        for(int i = 1; i <= minNumber; i++)
            if(a%i==0 && b%i==0)
                count++;
        return count;
    }
        public static void main(String[] args) {
        
            

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(commonFactors(a,b));

        scn.close();

}
}
