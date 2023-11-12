class Solution {
    public boolean isPalindrome(int x) {
       

        int reverse = 0;
        int number = x;
        while(number > 0) {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number / 10;  
        }  
        return x == reverse;
    }
}