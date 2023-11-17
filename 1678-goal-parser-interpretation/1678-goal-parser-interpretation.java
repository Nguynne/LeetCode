class Solution {
    public String interpret(String command) {
    // Create a StringBuilder to efficiently build and modify the resulting string
    StringBuilder S = new StringBuilder(command.length());

    // Iterate through each character in the input command
    for (int i = 0; i < command.length(); i++) {
        // Retain 'G' characters unchanged
        if (command.charAt(i) == 'G') {
            S.append('G');
        }

        // Check for the presence of '('
        if (command.charAt(i) == '(') {
            // If '(' is immediately followed by ')', replace with 'o' and skip the next character
            if (command.charAt(i + 1) == ')') {
                S.append('o');
                i++;
            } else {
                // If '(' is followed by other character(s), replace with "al" and skip the next 3 characters
                S.append("al");
                i = i + 3;
            }
        }
    }

    // Convert the StringBuilder to a String and return the result
    return S.toString();
}
}