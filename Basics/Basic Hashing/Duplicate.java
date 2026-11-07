//TODO: Check if an array contains any duplicate value - LeetCode 217
// Time: O(n) - single pass with set lookups
// Space: O(n) - HashSet of seen elements

import java.util.HashSet;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        // Track seen numbers
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            // Find duplicate
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
