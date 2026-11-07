//TODO: Check if n is a power of three - LeetCode 342
// Time: O(log_3 n) - keep dividing by 3
// Space: O(1) - only the input variable

public class Power3 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}
