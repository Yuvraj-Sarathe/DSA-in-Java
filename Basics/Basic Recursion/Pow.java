//TODO: Compute x^n fast with recursive binary exponentiation - LeetCode 50
// Time: O(log n) - exponent halves each level
// Space: O(log n) - recursion stack

//! Using recursion: O(log n)
class Pow {
    public double myPow(double x, int n) {
        // Cast to long to safely prevent overflow from Integer.MIN_VALUE (-2147483648)
        long N = n;
        
        // Handle negative exponents by taking the reciprocal of x and making N positive
        if (N < 0) {
            return 1 / fastPow(x, -N);
        }
        
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = fastPow(x, n / 2);
        
        if (n % 2 == 0) { // if even number of time we can make to power of 4 by multiplying squares
            return half * half;
        }
        else {
            return half * half * x; // cubes = x * square of x
        }
    }
}