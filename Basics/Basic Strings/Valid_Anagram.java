//TODO: Check if two strings are anagrams using a fixed-size array frequency map - LeetCode 242
// Time: O(n) - two passes over the strings
// Space: O(1) - fixed 256-slot counter array

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[256];

        if(s.length() != t.length()) return false;

        for(char a : s.toCharArray()) {
            letters[a]++;
        }
        for(char b : t.toCharArray()) {
            if (--letters[b] < 0) return false;
        }
        return true;
    }
}
