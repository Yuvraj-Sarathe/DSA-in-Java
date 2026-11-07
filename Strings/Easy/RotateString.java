//TODO: Check if goal can be obtained by rotating string s any number of times - LeetCode 796
// Time: O(n) - contains() scans s+s (length 2n)
// Space: O(n) - concatenated string s+s

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String concat = s+s;

        return concat.contains(goal);
    }
}
