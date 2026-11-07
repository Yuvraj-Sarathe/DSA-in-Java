//TODO: Find the length of the smallest repunit (1, 11, 111, ...) divisible by k, or -1 - LeetCode 1015
// Time: O(k) - at most k remainders before one repeats
// Space: O(1) - only remainder and count

public class Smallest_Int_divisible_by_K {
    public int smallestRepunitDivByK(int k) {
        //! Find smallest repunit (1, 11, 111, 1111...) divisible by k
        //! Repunits ending in 0 or 5 are impossible (divisibility rules)
        
        if(k % 2 == 0 || k % 5 == 0){
            return -1; // No repunit can be divisible
        }
        
        int rem = 1; // Start with repunit "1"
        int count = 1;
        
        while(rem % k != 0){ // Keep building until divisible
            rem = (rem * 10 + 1) % k; // Build next: 1→11→111... (modular arithmetic)
            //* Modular arithmetic: (a*b + c) % k = ((a%k * b%k) + c%k) % k 
            count++;
        }
        
        return count;
    }
}
