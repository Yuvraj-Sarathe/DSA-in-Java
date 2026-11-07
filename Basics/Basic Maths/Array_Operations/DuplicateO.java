//TODO: Check for duplicate elements using an optimal HashSet approach - LeetCode 217
// Time: O(n) - single pass with set add/contains
// Space: O(n) - HashSet of seen elements

import java.util.HashSet;
//! Good optimization
public class DuplicateO {
    public boolean containsDuplicate(int[] nums) {
        // Track seen numbers
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            // Check if the number 'num' is already in the 'set' HashSet.
            // If it is, return true, otherwise continue to the next iteration.
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
