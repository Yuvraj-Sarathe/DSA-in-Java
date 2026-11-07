//TODO: Check if n is a power of two - LeetCode 231
// Time: O(log n) - keep dividing by 2
// Space: O(1) - only the input variable

public class Power2 {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}
