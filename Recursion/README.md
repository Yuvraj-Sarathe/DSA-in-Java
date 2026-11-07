# 🔁 Recursion (Intermediate)

## Topic Gist

Moving past warm-ups: **memoisation, divide & conquer, linked-list recursion and constructive recursion** — building a result by recursing on `n-1`/`n/2` and combining. The naive exponential versions are kept next to their memoised/iterative upgrades so the complexity jump is visible. Warm-up basics (print N times, factorial, simple reverse) live in [`../Basics/Basic Recursion/`](../Basics/Basic%20Recursion/).

## 📚 Table of Contents

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`ClimbStairs.java`](ClimbStairs.java) | Count ways to climb n stairs (LeetCode 70) | O(n) | O(n) |
| [`Pascal.java`](Pascal.java) | Generate Pascal's triangle rows (LeetCode 118) | O(n²) | O(n²) |
| [`Merge_Two_Sorted_Lists.java`](Merge_Two_Sorted_Lists.java) | Merge two sorted linked lists (LeetCode 21) | O(n + m) | O(n + m) |
| [`TOH.java`](TOH.java) | Tower of Hanoi — print every move | O(2ⁿ − 1) | O(n) |
| [`Medium/Kth_Symbol.java`](Medium/Kth_Symbol.java) | K-th symbol in grammar (LeetCode 779) | O(n) | O(n) |

## 🧭 General Approach

1. **Memoise any overlapping recursion** — `ClimbStairs` goes from O(2ⁿ) to O(n) the moment results are cached in an array.
2. **Build-vs-decide recursion** — Pascal's triangle recurses on `numRows` and gets the previous triangle back, then extends each row.
3. **Linked-list recursion** → handle the head, recurse on `next`, return the merged tail; the base case is a `null` list.
4. **Divide & conquer** → TOH splits `n` disks into `n-1` + 1 + `n-1`; `Kth_Symbol` maps `k` into the previous row by halving.

*Complexity is documented in each file's `//TODO:` header.*
