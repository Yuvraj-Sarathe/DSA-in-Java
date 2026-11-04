public class ClimbStairs {
    //! Recursion: O(n) time and O(n) space
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return recStairs(n, memo);
    }

    private int recStairs(int n, int[] memo) {
        if (n <= 3) return n;

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = recStairs(n - 1, memo) + recStairs(n - 2, memo);
        return memo[n]; 
    }
}

//! THE BEST ONE: DYNAMIC PROGRAMMING (O(n) time and O(1) space)

/*
no stairs == 0; 1 stair == 1; 2 stairs == 2 (these will be our base cases)
we will keep track of the previous 2 stairs because the next step always requires the sum of previous two!
* consider it like this you reached step 5 in n ways. Now to reach 6th you can just add on the result from 5th and 4th step as they are the steps you MUST reach in both condition to reach 6th
we will start the loop for 3 stairs and increase further
change prev2 to prev1 and prev1 to current while current is the sum of both.
*/

class Solution {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int prev2 = 1;
        int prev1 = 2;
        int current = 0;
        
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
}
