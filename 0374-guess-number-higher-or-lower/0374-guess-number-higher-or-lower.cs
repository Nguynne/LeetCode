/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution : GuessGame {
    public int GuessNumber(int n) {
        int min = 0;
        int max = n;
        int mid = n/2;
        while (min <= max){
            if (guess(mid) == -1){
                mid -= 1;
            }
            else if (guess(mid) == 0)
            {
                return mid;
            }
            else{
                mid += 1;
            }
            min++;
        }
        return -1;
    }
}