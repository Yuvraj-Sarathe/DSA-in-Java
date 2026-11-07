# 🎲 Miscellaneous (Basic Maths)

## Topic Gist

A grab-bag of math problems that don't fit the other subfolders - **binary/exponentiation tricks, base conversions, trailing zeroes and character-index math**. These are mostly single-formula LeetCode-style problems.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Power2.java`](Power2.java) | Check if n is a power of two | O(log n) | O(1) |
| [`Power3.java`](Power3.java) | Check if n is a power of three | O(log₃ n) | O(1) |
| [`Expo.java`](Expo.java) | Pow(x, n) - `Math.pow` (active) vs binary exponentiation (commented) | O(1) / O(log n) | O(1) |
| [`SQRT.java`](SQRT.java) | Integer square root - Newton's method (no `Math.sqrt` cheating) | O(log x) | O(1) |
| [`Fact_Zeroes.java`](Fact_Zeroes.java) | Count trailing zeroes in n! (count factors of 5) | O(log₅ n) | O(1) |
| [`PivotInt.java`](PivotInt.java) | Pivot where left sum = right sum (`x² = totalSum`) | O(1) | O(1) |
| [`Excel_Column.java`](Excel_Column.java) | Excel column title → number (base-26 conversion) | O(len) | O(1) |
| [`Unique_char.java`](Unique_char.java) | First non-repeating character via `indexOf`/`lastIndexOf` | O(n²) | O(1) |
| [`Unique_char_O.java`](Unique_char_O.java) | Same problem - frequency-array version | O(n) | O(128) |

## 🧭 General Approach

- **Powers** → repeatedly divide until it's 1 (or use bit tricks for base 2).
- **Trailing zeroes** → count how many times 5 divides n! (10 = 2×5, and 2s are abundant).
- **Column/base problems** → treat the string as digits in that base (`result = result*base + digit`).
- **Integer sqrt** → binary search or Newton's iterative formula.

*Each file carries its own formula derivation and complexity comment.*
