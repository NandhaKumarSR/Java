//2413. Smallest Even Multiple

import java.util.*;
public class SmallestEvenMultiple {
        public static int smallestEvenMultiple(int n) {
            if(n%2==0)
                return n;
            else
                return n*2;        
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(smallestEvenMultiple(n));
        scn.close();   
    }
}