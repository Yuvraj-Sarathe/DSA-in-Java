//TODO: Sort an array using Bubble Sort - repeatedly swap adjacent out-of-order pairs
// Time: O(n^2) worst/average, O(n) best (already sorted, early exit)
// Space: O(1) - in-place

import java.util.Arrays;

public class BubbleSort{

    //! Bubble Sort: O(n^2)
    public static void sort(int[] arr) {
        // Edge case check: if array is null or has 0-1 elements, it's already sorted
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        for(int i=0; i<arr.length-2; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
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