//TODO: Sort an array using recursive Insertion Sort - sort n-1 elements, then insert the last one
// Time: O(n^2)
// Space: O(n) - recursion stack

public class RecInsert {
    public static void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        sort(arr, n - 1);
        insert(arr, n - 1);
    }

    private static void insert(int[] arr, int n) {
        int temp = arr[n];
        int j = n - 1;
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 45, 98, 5, 22, 1, 65, 87, 3, 21, 24 };
        sort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
