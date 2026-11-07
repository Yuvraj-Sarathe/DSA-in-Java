# 🔁 Basic Recursion

## Topic Gist

The basics of thinking recursively: identify a **base case**, a **smaller subproblem**, and trust that the recursive call handles the rest. This folder mixes warm-up problems (print 1→N, factorial) with classic recursion patterns — array/string reversal by two-pointer recursion, palindrome checking, sorted checks and digit sums. Each problem that also has an iterative solution points to its counterpart in another folder instead of duplicating code.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Name_N_times.java`](Name_N_times.java) | Print a name N times | O(n) | O(n) |
| [`Number_from_1_to_n.java`](Number_from_1_to_n.java) | Print 1 → N (print after the recursive call) | O(n) | O(n) |
| [`Number_from_N_to_1.java`](Number_from_N_to_1.java) | Print N → 1 (print before the recursive call) | O(n) | O(n) |
| [`Sum_till_N.java`](Sum_till_N.java) | Sum of first N numbers — functional + parameterised recursion | O(n) | O(n) |
| [`SumOfArrayElements2.java`](SumOfArrayElements2.java) | Sum of array elements via recursion | O(n) | O(n) |
| [`SumOfDigits.java`](SumOfDigits.java) | Sum of digits of a number (digit loop + recursive reduction) | O(digits) | O(log n) |
| [`Factorial.java`](Factorial.java) | N! | O(n) | O(n) |
| [`Fibbonacci.java`](Fibbonacci.java) | Fibonacci — naive recursion (O(2ⁿ)); iterative O(n) version commented | O(2ⁿ) | O(n) |
| [`Tribonnaci.java`](Tribonnaci.java) | Tribonacci — memoised recursion (O(n)); iterative O(1)-space version commented | O(n) | O(n) |
| [`Pow.java`](Pow.java) | Pow(x, n) — fast binary exponentiation recursion | O(log n) | O(log n) |
| [`Prime.java`](Prime.java) | Primality check by recursive trial division | O(√n) | O(√n) |
| [`CheckArraySorted.java`](CheckArraySorted.java) | Sorted check by recursion — iterative version in [`../Basic Array/`](../Basic%20Array/) | O(n) | O(n) |
| [`Reverse_Array.java`](Reverse_Array.java) | Reverse an array by two-pointer recursion — iterative version in [`../Basic Array/`](../Basic%20Array/) | O(n) | O(n) |
| [`ReverseString.java`](ReverseString.java) | Reverse a string by two-pointer recursion — iterative version in [`../Basic Strings/`](../Basic%20Strings/) | O(n) | O(n) |
| [`String_Palindrome.java`](String_Palindrome.java) | String palindrome by recursion — two-pointer loop version in [`../Basic Strings/`](../Basic%20Strings/) | O(n) | O(n) |

## 🧭 General Approach

1. **Base case first** — the smallest input that answers itself.
2. Define the recursive step in terms of `n-1` (or a shrinking window `L+1, R-1` for two-pointer recursion) — don't trace the whole tree in your head.
3. For sequence problems (Fibonacci, Tribonacci) compare the naive recursion against the memoised/iterative version — that's where the exponential → linear jump comes from.
4. Two-pointer recursion (reverse, palindrome) passes **both ends inward** each call: O(n) calls, O(n) stack.

*Detailed walkthroughs, `//TODO:` problem statements and complexity comments are inside each file.*
