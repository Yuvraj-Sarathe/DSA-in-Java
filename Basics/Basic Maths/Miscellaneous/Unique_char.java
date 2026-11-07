//TODO: Find index of the first non-repeating character using indexOf/lastIndexOf - LeetCode 387 (naive)
// Time: O(n^2) - indexOf/lastIndexOf scan per character
// Space: O(1) - no extra structures

public class Unique_char {
    public int firstUniqChar(String str) {
        //* str.indexOf(character) gives the first index of character
        //* str.lastIndexOf(character) gives the last index of character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}
