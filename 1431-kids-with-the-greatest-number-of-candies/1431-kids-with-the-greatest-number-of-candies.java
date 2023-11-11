class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = candies[0];
        for (int i = 0; i < candies.length; i++){
            if (max < candies[i])
                max = candies[i];
        }
        
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            boolean isTrue = true;
            if(candies[i] + extraCandies < max)
                isTrue = false;
            ans.add(isTrue);
        }
        return ans;
    }
}