class kidsWithGreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int maxCandies = candies[0];
        for(int i = 0; i< candies.length; i++ ){
            maxCandies = candies[i] > maxCandies ? candies[i] : maxCandies;
        }
        for(int i = 0; i< candies.length; i++)
        {
            if (candies[i]+extraCandies >= maxCandies)
            {
                list.add(true);
            }
            else
            list.add(false);
        }
     return list;

     public static void main(String[] args){

        List<Boolean> list = kidsWithCandies(new int[]{1,2,3,4,5}, 3);

        for(boolean i: list){
            System.out.println(i);
        }
     }

    }
}