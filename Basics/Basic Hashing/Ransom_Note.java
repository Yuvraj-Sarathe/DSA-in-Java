//TODO: Check if a ransom note can be formed from letters of a magazine (each magazine letter used once) - LeetCode 383
// Time: O(n + m) - count magazine then consume for note
// Space: O(26) - fixed 26-slot counter array

/*
! Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

! Each letter in magazine can only be used once in ransomNote.
*/

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] hash = new int[26];
        for(char c : magazine.toCharArray()) hash[c-'a']++; // increase the frequency of that letter by 1 in hash using c-'a' (a is 0 indexed)
        for(char c : ransomNote.toCharArray()) {
            if(hash[c-'a'] == 0) return false; // if the letter in ransom exist but the magazine has already exhausted it then ofc it is not true
            hash[c-'a']--;
        }
        return true;
    }
}
