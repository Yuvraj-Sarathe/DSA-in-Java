//TODO: Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

//! LEETCODE 451

/*
Input: "tree"

Step 1: Count Frequencies (The Map)
e -> 2
r -> 1
t -> 1

Step 2: Map to Buckets (Array of Lists)
The max possible frequency is the length of the string (4). 
So we create an array of size 5 (indexes 0 to 4).

Index (Frequency):  [0]     [1]       [2]     [3]     [4]
Content (Chars):   null   [r, t]     [e]     null    null
                          ^          ^
                 freq is 1          freq is 2

Step 3: Rebuild backwards
- Start at index 4: empty
- Start at index 3: empty
- Index 2: contains 'e'. Repeat 'e' 2 times -> "ee"
- Index 1: contains 'r' and 't'. Repeat 'r' 1 time -> "eer". Repeat 't' 1 time -> "eert"

*/

import java.util.*;
public class SortbyFreq {
    public String frequencySort(String s) {
        
        // Calculating frequency
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character>[] buckets = new List[s.length() + 1]; // an array that holds lists
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>(); // create a new list
            }
            buckets[frequency].add(character); // add the character in that list according to frequency
        }

        // String Builder a mutable sequence of characters
        StringBuilder result = new StringBuilder();
        for (int i = s.length(); i >= 1; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    result.append(String.valueOf(c).repeat(i)); // repeat the character to the number of times it was repeated
                }
            }
        }

        return result.toString();
    }
}
