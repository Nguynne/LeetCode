public class Solution {
    public IList<string> FizzBuzz(int n) {
         IList<string> results = new List<string>();
        
         for (int i = 1; i <= n; i++) {
            string output = ""; 

            if (i % 3 == 0) {
                output += "Fizz"; 
            }
            if (i % 5 == 0) {
                output += "Buzz"; 
            }

            results.Add(output.Length > 0 ? output : i.ToString()); // Add either "FizzBuzz", "Fizz", "Buzz", or the number itself
        }
        return results;
    }
}