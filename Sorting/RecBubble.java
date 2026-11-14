//TODO: Sort an array using recursive Bubble Sort - one full bubbling pass per recursion level
// Time: O(n^2)
// Space: O(n) - recursion stack

public class RecBubble {
    public static void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        sort(arr, n - 1);
        bubble(arr, n - 1);
    }

    private static void bubble(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        if (arr[n] < arr[n - 1]) {
            int temp = arr[n];
            arr[n] = arr[n - 1];
            arr[n - 1] = temp;
        }
        bubble(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 45, 98, 5, 22, 1, 65, 87, 3, 21, 24 };
        sort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
