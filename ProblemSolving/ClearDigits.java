//3174. Clear Digits
//Approach: Brute force

public class ClearDigits {

    public static void main(String[] args) {
        System.out.println(clearDigits("aa3b5c7"));
    }

    public static String clearDigits(String s) {
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            s = s.replace(s.substring(i-1,i+1),"");
            flag = true;
            break;
            }
        }
        }
        return s;        
    }
}