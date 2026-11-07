//TODO: Return the longest substring (prefix) of num that represents an odd number; "" if no odd digit exists - LeetCode 1903
// Time: O(n) - one right-to-left scan
// Space: O(n) - substring copy of the result

public class LargestOddNumber {
        public String largestOddNumber(String num) {
            // Traverse from right to left
            for (int i = num.length() - 1; i >= 0; i--) {
                // Check if the current character represents an odd digit
                if ((num.charAt(i) - '0') % 2 != 0) {
                    return num.substring(0, i + 1);
                }
            }
            // Return empty string if no odd digit is found
            return "";
        }
}