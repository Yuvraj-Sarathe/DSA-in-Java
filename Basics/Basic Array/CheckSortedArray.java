//TODO: Check whether the given array is sorted in non-decreasing order
// Time: O(n) - single pass over adjacent pairs
// Space: O(1) - only loop variables

public class CheckSortedArray {
    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
