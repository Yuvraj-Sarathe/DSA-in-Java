//TODO: Reverse a character array using two-pointer recursion (iterative version lives in ../Basic Strings/Reverse_String.java) - LeetCode 344
// Time: O(n) - one swap per level
// Space: O(n) - recursion stack

public class ReverseString {
    //! Iterative Approach -> visit ../Basic Strings/Reverse_String.java for that approach

    //! Recursive
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }
    private void reverseHelper(char[] arr, int L, int R) {
        if (L >= R) return;
        char temp = arr[L];
        arr[L] = arr[R];
        arr[R] = temp;
        reverseHelper(arr, L + 1, R - 1);
    }
}
