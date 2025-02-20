//771. Jewels and Stones
//Approach: Brute force

public class JewelsandStones {
    public static void main(String[] args) {
        String jewels = "aAbZz", stones = "ASDFCVBNMz";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<jewels.length();i++)
            for(int j = 0; j<stones.length();j++)
                if(stones.charAt(j) == jewels.charAt(i))
                    count++;
        return count;
    }
}
