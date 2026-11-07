//TODO: Check if an array is sorted using recursion instead of a loop (iterative version lives in ../Basic Array/CheckSortedArray.java)
// Time: O(n) - one recursive comparison per adjacent pair
// Space: O(n) - recursion stack

public class CheckArraySorted {
    public static boolean isSorted(int[] nums) {
        // Start the recursion from the first index
        return isSortedRecursive(nums, 0);
    }

    private static boolean isSortedRecursive(int[] nums, int index) {
        // Base case: If we reach the last element or the array is empty, it is sorted
        if (index >= nums.length - 1) {
            return true;
        }

        // If the current element is greater than the next, it's not sorted
        if (nums[index] > nums[index + 1]) {
            return false;
        }

        // Recursive step: Move to the next index
        return isSortedRecursive(nums, index + 1);
    }
    
    /*
    Iterative Approach -> visit ../Basic Array/CheckSortedArray.java for that approach
    */
}
