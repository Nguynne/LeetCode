public class Solution {
    public bool IsPerfectSquare(int num) {
        for (int i = 1; i <= num/2 + 1; i++){
            if (i * i == num)
                return true;
        }
        return false;
    }
}