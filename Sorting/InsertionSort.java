//TODO: Sort an array using Insertion Sort - grow a sorted prefix by inserting each element
// Time: O(n^2) worst/average, O(n) best (nearly sorted)
// Space: O(1) - in-place

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        // Edge case check: if array is null or has 0-1 elements, it's already sorted
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        //! Insertion Sort: O(n^2)
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        sort(numbers);
        System.out.println("After sorting:  " + Arrays.toString(numbers));
    }
}
