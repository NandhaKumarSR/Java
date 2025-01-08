//2769.Find the Maximum Achievable Number
//Description:  pattern approach as the constrains are between 1 and 50
import java.util.Scanner;



public class MaximumAchievableNumber {
    public static int theMaximumAchievableX(int num, int t) {
        return (num+(t*2));  
    }
        public static void main(String[] args) {
        
            

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int t = scn.nextInt();
        System.out.println(theMaximumAchievableX(num,t));

        scn.close();

}
}
