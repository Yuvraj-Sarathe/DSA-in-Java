//TODO: Check if two strings are isomorphic (character mapping is bijective) - LeetCode 205
// Time: O(n) - one pass building the mapping
// Space: O(k) - map + set over distinct characters

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        Map<Character, Character> mapST = new HashMap<>();
        Set<Character> setT = new HashSet<>();
        
        for (int i = 0; i < sChar.length; i++) {
            char original = sChar[i];
            char replacement = tChar[i];
            
            if (mapST.containsKey(original)) {
                if (mapST.get(original) != replacement) {
                    return false;
                }
            } else {
                if (setT.contains(replacement)) {
                    return false;
                }
                mapST.put(original, replacement);
                setT.add(replacement);
            }
        }
        return true;
    }
}
