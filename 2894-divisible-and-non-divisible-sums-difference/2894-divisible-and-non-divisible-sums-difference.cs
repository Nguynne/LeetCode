public class Solution {
    public int DifferenceOfSums(int n, int m) {
        int notdivisble = 0;
        int divisible = 0;
        
        for(int i = 1; i <= n; i++){
            if (i % m == 0){
                divisible += i;
            }
            else{
                notdivisble += i;
            }
        }
        return notdivisble - divisible;
    }
}