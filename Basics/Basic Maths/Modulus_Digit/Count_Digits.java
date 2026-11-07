//TODO: Count the number of digits in a positive integer
// Time: O(digits) - one division per digit (O(log_10 n))
// Space: O(1) - only the counter

public class Count_Digits {
    public int countDigits(int n) {
        int count = 0;
        // Remove last digit each iteration
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
        // count==log 10 (N) + 1 
    }
}
