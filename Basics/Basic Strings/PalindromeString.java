//TODO: Check if a string is a valid palindrome (letters+digits only, case-insensitive) - LeetCode 125
// Time: O(n) - one clean-up pass + one two-pointer pass
// Space: O(1) - two pointers (cleaned copy is O(n))

public class PalindromeString {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int L = 0;
        int R = result.length() - 1;
        
        while (L < R) {
            
            if (result.charAt(L) != result.charAt(R)) {
                return false;
            }
            
            L++;
            R--;
        }
        return true;
    }
}
