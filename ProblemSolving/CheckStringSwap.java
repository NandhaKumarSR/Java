//1790. Check if One String Swap Can Make Strings Equal
//Approach: count number of different characters store it in different arrays and compare

public class CheckStringSwap {
    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
            count++;
        }
        char[] letter1 = new char[2];
        char[] letter2 = new char[2];
        int j = 0;
        if(count == 2){
            for(int i = 0; i< s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    letter1[j] = s1.charAt(i);
                    letter2[j++] = s2.charAt(i);
                }                
            }
            if(letter1[0] == letter2[1] && letter1[1] == letter2[0])
            return true;
            else
            return false;
        }
        else if(count == 0)
        return true;
        else
        return false;
        
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("love","vole"));
    }
    
}
