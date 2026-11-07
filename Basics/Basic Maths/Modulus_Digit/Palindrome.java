//TODO: Check if a non-negative integer reads the same forwards and backwards - LeetCode 9
// Time: O(digits) - reverse-and-compare loop
// Space: O(1) - only rev and temp

public class Palindrome {
    public boolean isPalindrome(int x) {
        // Negative numbers can't be palindromes
        if(x < 0) {
            return false;
        }
        // Store original number
        int rev = 0, temp = x;
        // Reverse the number
        while(x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        // Compare original with reversed
        return temp == rev;
    }
}
