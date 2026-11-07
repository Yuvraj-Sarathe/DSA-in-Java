//TODO: Check if two strings are anagrams using a HashMap frequency map - LeetCode 242
// Time: O(n) - count s then consume with t
// Space: O(k) - HashMap over distinct characters (k <= n)


import java.util.Map;
import java.util.HashMap;

//! Given two strings s and t, return true if t is an anagram of s, and false otherwise.

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); // put c in map and updates with its current frequency BUT if it does not exist now, it adds it with 0
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1); // decreasing frequency of each letter one by one until 0
            if (map.get(c) == 0) map.remove(c); // remove everything as they became 0
        }
        return map.isEmpty();
    }
    /*
    ! Array-frequency Approach -> visit ../Basic Strings/Valid_Anagram.java for that approach
    */
}
