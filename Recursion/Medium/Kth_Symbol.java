/* LEETCODE: 779 (Medium)
TODO: We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.
*/

/*
n=1 -> 0 (2^0) = length
n=2 -> 01 (2^1)
n=3 -> 0110 (2^2)

length = 2^(n-1)

* Every new row is just a copy of previous one for the first half and mirror of previous one for the second half

so if n=3 -> 0110
    n=4 -> 0110-mid-1001

mid = 2^(n-2)

*/

/*
! ALGO:

if(n==1) return 0; (base case as the first row only has 0)
we calculate mid point
* if k <= mid (k is just the index of the number in that row, so if mid is larger than the k then 
* we are in the first half of the row) return what was k's value in previous row
* if k > mid we will return the opposite of whatever k was in last

*/

class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) return 0;
        
        int mid = (int) Math.pow(2, n - 2);
        
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        }
        else {
            return kthGrammar(n - 1, k - mid) == 0 ? 1 : 0;
        }
    }
}
