//1672. Richest Customer Wealth
//Approach: Contribution technique

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[0].length; j++){
                sum+=accounts[i][j];
            }
            if(sum > richest)
            richest = sum;
        }
        return richest;
    }


}
