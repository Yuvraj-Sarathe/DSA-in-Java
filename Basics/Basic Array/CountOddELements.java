//TODO: Count the number of odd elements in an array
// Time: O(n) - one pass through the array
// Space: O(1) - only a counter

public class CountOddELements {
    public int countOdd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
