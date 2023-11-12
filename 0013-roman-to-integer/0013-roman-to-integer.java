import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        Map<Character, Integer> m = new HashMap<>();
        
        // Initialize the HashMap with the values of common Roman numerals
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        // Initialize the result variable to store the total value
        int ans = 0;
        
        // Iterate through the characters in the input string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current numeral is smaller than the next numeral
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                // If true, subtract the current numeral's value
                ans -= m.get(s.charAt(i));
            } else {
                // If false, add the current numeral's value
                ans += m.get(s.charAt(i));
            }
        }
        
        // Return the total value of the Roman numeral string
        return ans;
    }
}
