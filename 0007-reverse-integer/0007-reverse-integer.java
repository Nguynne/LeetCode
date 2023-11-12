class Solution {
    public int reverse(int x) {
        // Variable to store the reversed number
        long reverse = 0;

        // Reverse the digits of the number while it is not equal to 0
        while (x != 0) {
            // Get the last digit of the number
            int remainder = x % 10;
            
            // Remove the last digit from the number
            x /= 10;

            // Build the reversed number by adding the last digit
            reverse = reverse * 10 + remainder;
        }

        // Check if the original number was negative and adjust the sign of the reversed number
        if (x < 0)
            reverse *= -1;

        // Check for overflow or underflow, return 0 if out of the integer range
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }

        // Cast the reversed number to int and return the result
        return (int) reverse;
    }
}