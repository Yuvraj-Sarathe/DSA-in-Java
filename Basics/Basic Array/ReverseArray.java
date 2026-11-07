//TODO: Reverse an array/List in place (two-pointer swap; Collections.reverse for List)
// Time: O(n) - each pair of elements swapped once (Collections.reverse: O(n))
// Space: O(1) - in-place, only a temp variable

import java.util.Collections;
import java.util.List;

public class ReverseArray{
    public void CreverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }

    public void reverseArray(int[] arr) {
        int L = 0;
        int R = arr.length - 1;
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }
}