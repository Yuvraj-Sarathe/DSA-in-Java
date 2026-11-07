//TODO: Return sorted squares of a sorted array using the square-then-sort approach - LeetCode 977
// Time: O(n log n) - Collections.sort on the squares
// Space: O(n) - ArrayList of squares

import java.util.*;

public class Square_of_SortedArray {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> sqr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int square=nums[i]*nums[i];
            sqr.add(square);
        }
        Collections.sort(sqr);
        int[] result = new int[sqr.size()];
        for (int i = 0; i < sqr.size(); i++) {
            result[i] = sqr.get(i);
        }
        
        return result;
    }
}
