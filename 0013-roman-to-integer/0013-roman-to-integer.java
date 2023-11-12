class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // Corrected: Use charAt(i) to get the current character
            String currentSymbol = String.valueOf(s.charAt(i));

            // Corrected: Use get method to retrieve the value for the key
            int value = roman.get(currentSymbol);

            // Accumulate the value
            result += value;

            // Check for subtraction cases (e.g., IV, IX, etc.)
            if (i > 0) {
                String prevSymbol = String.valueOf(s.charAt(i - 1));
                if (roman.get(prevSymbol) < value) {
                    // Subtract twice the previous value
                    result -= 2 * roman.get(prevSymbol);
                }
            }
        }
        return result;
    }
}