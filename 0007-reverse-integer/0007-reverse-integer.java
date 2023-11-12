class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while(x != 0){
            int remainer = x % 10;
            x /= 10;
            reverse = reverse * 10 + remainer;
        }
        if(x < 0)
            reverse *= -1;
        if(reverse > Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
}