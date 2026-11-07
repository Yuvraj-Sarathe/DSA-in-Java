//TODO: Find LCM of two numbers by brute-force stepping from max(a,b) to a*b
// Time: O(min(a,b)) worst case - one check per multiple of max
// Space: O(1) - only loop variables

public class LCM {
    // Brute force approach
    public int findLcm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        // Start from max, increment by max each time
        for (int i = max; i <= a*b; i+=max) {
            // First number divisible by both is LCM
            if (i % min == 0) {
                return i;
            }
        }
        return a*b;
    }
}