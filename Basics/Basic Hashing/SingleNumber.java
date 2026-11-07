//TODO: Find the number that appears exactly once when every other number appears twice - LeetCode 136 (HashMap approach)
// Time: O(n) - two passes (count then lookup)
// Space: O(n) - HashMap of frequencies

import java.util.HashMap;
import java.util.Map;
// Find the number that is not repeated in an array
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
    
        for (int x : nums) {
            counts.put(x, counts.getOrDefault(x, 0) + 1); // puts the number in the map and updates its frequency
        }
        
        for (int x : nums) {
            if (counts.get(x) == 1) { // if freq==1 then it is unique
                return x;
            }
        }
        return -1;
    }
}
