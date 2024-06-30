public class Solution
{
    public bool IsPerfectSquare(int num)
    {
        int begin = 1;
        int end = num;

        while (begin <= end)
        {
            int mid = (begin + end) / 2;
            long square = (long)mid * mid;

            if (square == num)
            {
                return true;
            }
            else if (square < num)
            {
                begin = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return false;
    }
}