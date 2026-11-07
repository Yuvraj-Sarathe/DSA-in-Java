//TODO: Reverse an array in place using two-pointer recursion (iterative version lives in ../Basic Array/ReverseArray.java)
// Time: O(n) - one swap per level
// Space: O(n) - recursion stack

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Array {

    public void reverseRecArray(int[] arr) {
        reverseHelper(arr, 0, arr.length - 1);
    }
    
    private void reverseHelper(int[] arr, int L, int R) {
        if (L >= R) return;
        int temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
        reverseHelper(arr, L + 1, R - 1);
    }
    
    /*
    Iterative Approach -> visit ../Basic Array/ReverseArray.java for the iterative (two-pointer / Collections.reverse) approach
    */
}
