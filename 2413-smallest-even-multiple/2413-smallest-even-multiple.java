class Solution {
    public int smallestEvenMultiple(int n) {
        int res;
        for(int i = 1; ; i++){
            if(i % 2 == 0 && i % n == 0){
               res = i;
                break;
            }
        }
        return res;
    }
}