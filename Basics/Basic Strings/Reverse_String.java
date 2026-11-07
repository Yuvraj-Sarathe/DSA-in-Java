//TODO: Reverse a character array in place - LeetCode 344
// Time: O(n) - each pair swapped once
// Space: O(1) - in-place two-pointer swap

public class Reverse_String {
    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right]; 
            s[right] = temp;
            left++;
            right--;
        }
    }
}
