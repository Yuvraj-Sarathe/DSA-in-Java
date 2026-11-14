//TODO: Sort an array using Selection Sort - repeatedly select the minimum of the unsorted suffix
// Time: O(n^2) - always all pairs
// Space: O(1) - in-place

import java.util.Arrays;

public class SelectionSort {
    
    //! Selection Sort: O(n^2)
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        for (int i = 0; i <= arr.length - 2; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = { 64, 34, 25, 12, 22, 11, 90, 1 };

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        sort(numbers);

        System.out.println("After sorting:  " + Arrays.toString(numbers));
    }

}
