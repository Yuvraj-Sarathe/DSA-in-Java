# 🧩 Recursion — Medium

## Topic Gist

Medium-difficulty recursion: problems where the recursive insight is **not** "call `f(n-1)`", but "map the current position back into a smaller instance of the same problem".

## 📚 Table of Contents

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Kth_Symbol.java`](Kth_Symbol.java) | K-th symbol in grammar — build the 0→01 / 1→10 table and return row n, position k (LeetCode 779) | O(n) | O(n) |

## 🧭 General Approach

- Row `n` is a **copy of row `n-1` for the first half, mirror for the second half** — length doubles each row (2^(n-1)).
- Map `k` into the previous row: first half → same `k`; second half → flipped bit from `k - 2^(n-2)`.
- Recursing on `n` (not on `k`) keeps the depth at O(n) instead of simulating the whole 2ⁿ table.

*Complexity and the full derivation are commented inside the file.*
