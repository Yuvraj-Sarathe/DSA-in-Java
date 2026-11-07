//TODO: Check if a string is a palindrome using recursion (iterative two-pointer version lives in ../Basic Strings/PalindromeString.java) - LeetCode 125
// Time: O(n) - one recursive call per outer pair
// Space: O(n) - recursion stack

public class String_Palindrome {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        //! Loop/two-pointer Approach -> visit ../Basic Strings/PalindromeString.java for that approach

        //! Recursion Approach
        return checkPalindrome(0, result);
    }
    private boolean checkPalindrome(int i, String res) {
        int n = res.length();

        if (i >= n / 2) return true;
        if (res.charAt(i) != res.charAt(n - i - 1)) return false;
        return checkPalindrome(i + 1, res);
    }
}