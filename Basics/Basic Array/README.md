# 📗 Basic Array

## Topic Gist

Array fundamentals — **contiguous 0-indexed storage**, single-pass traversal, and the two-pointer swap. Every problem here is solved with one loop (or two pointers), making this the place to internalize `for`, `while`, and in-place updates before hashing or recursion complicate things.

## 📚 Table of Contents

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`SumArrayElements.java`](SumArrayElements.java) | Find the sum of all elements of an array | O(n) | O(1) |
| [`CheckSortedArray.java`](CheckSortedArray.java) | Check whether an array is sorted in non-decreasing order | O(n) | O(1) |
| [`ReverseArray.java`](ReverseArray.java) | Reverse an array/List — two-pointer swap + `Collections.reverse` | O(n) | O(1) |
| [`CountOddELements.java`](CountOddELements.java) | Count the number of odd elements | O(n) | O(1) |

## 🧭 General Approach

- **Accumulator pattern** → one variable (`sum`, `count`) updated per element; never recompute inside the loop.
- **Two-pointer swap** → `L` from the start, `R` from the end, swap and converge — the standard in-place reverse, O(n) time / O(1) space.
- **Sorted check** → only adjacent pairs matter: `arr[i] > arr[i+1]` means not sorted; a single early-exit pass beats comparing every pair (O(n²)).
- The iterative versions here have recursion twins in [`../Basic Recursion/`](../Basic%20Recursion/) — compare them side by side.

*Complexity is documented in each file's `//TODO:` header.*
