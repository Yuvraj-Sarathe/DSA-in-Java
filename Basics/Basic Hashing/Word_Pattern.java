//TODO: Check if a string follows a given pattern under a bijection (letter <-> word) - LeetCode 290
// Time: O(n) - split words + one mapping pass
// Space: O(p + w) - two HashMaps for the bijection

/*
! Given a pattern and a string s, find if s follows the same pattern.

! Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. 

! Specifically:

! Each letter in pattern maps to exactly one unique word in s.
! Each unique word in s maps to exactly one letter in pattern.
! No two letters map to the same word, and no two words map to the same letter.
*/

import java.util.HashMap;
import java.util.Map;


public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if (pattern.length() != word.length) return false;

        Map<Object, Integer> map = new HashMap<>(); // Object helps keeping both char and string keys without collision
        for (Integer i = 0; i < pattern.length(); i++){ // used Integer because map.put returns Object i.e. Integer instead of primitive int
            if (map.put(pattern.charAt(i), i) != map.put(word[i], i)) return false; // adds both char and string keys and compare directly if their frequency is same and if not, return false
        }
        return true;
    }
}
