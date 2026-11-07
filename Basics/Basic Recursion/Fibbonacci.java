//TODO: Compute the nth Fibonacci number with naive recursion (commented iterative O(n) alternative included) - LeetCode 509
// Time: O(2^n) - exponential re-computation (iterative alternative: O(n))
// Space: O(n) - recursion stack (iterative alternative: O(1))

public class Fibbonacci {
    public int fib(int n) {
        //! Recursive Fibbonacci
        if(n<=1) return n;

        return fib(n-1) + fib(n-2);
        //! Looped Fibbonacci
        /*
        if(n<=1) return n;
        int f = 0;
        int s = 1;
        for(int i=1; i<=n; i++){
            int t = f+s;
            f=s;
            s=t;
        }
        return f;
        */
    }
}
