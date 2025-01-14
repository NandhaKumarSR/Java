//2011. Final Value of Variable After Performing Operations

public class FinalValueAfterOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String i: operations){
            if(i.charAt(1) == '-')
            x--;
            else
            x++;
        }
        return x;        
    }

    public static void main(String[] args) {
        
        String[] arr = {"x++","x--","++x"};
        System.out.println(finalValueAfterOperations(arr));        
    }    
}
