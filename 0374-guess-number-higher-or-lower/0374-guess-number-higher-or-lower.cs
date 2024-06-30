public class Solution : GuessGame {
    public int GuessNumber(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right){
            int mid = left + (right - left) / 2;
            int check = guess(mid);
            if (check == 0)
                return mid;
            else if (check == -1)
                right = mid;
            else
                left = mid + 1;;
                
        }
        return left;
    }
}