/*
import java.util.HashMap;
import java.util.Map;
! Given a pattern and a string s, find if s follows the same pattern.

! Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. 

! Specifically:

! Each letter in pattern maps to exactly one unique word in s.
! Each unique word in s maps to exactly one letter in pattern.
! No two letters map to the same word, and no two words map to the same letter.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> ref = new HashMap<>();
        Set<String> claimedWords = new HashSet<>();

        String[] words = s.split(" ");
        
        if (words.length != pattern.length()) {
            return false;
        }

        for(int i=0; i<pattern.length(); i++){
            char pChar = pattern.charAt(i);

            if (ref.containsKey(pChar)) {
                if (!words[i].equals(ref.get(pChar))) {
                    return false;
                }
            } else {
                if (claimedWords.contains(words[i])) {
                    return false;
                }
                ref.put(pChar, words[i]);
                claimedWords.add(words[i]);
            }
        }
        
        return true; 
    }
}

//! Optimised:
/*
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w = s.split(" ");
        if (pattern.length() != w.length) return false;
        Map<Object, Integer> map = new HashMap<>();
        for (Integer i = 0; i < pattern.length(); i++)
        * Direct comparison
            if (map.put(pattern.charAt(i), i) != map.put(w[i], i)) return false; 
        return true;
    }
}
*/