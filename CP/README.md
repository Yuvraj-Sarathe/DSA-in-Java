# 💻 Competitive Programming (CP)

## Topic Gist

HackerRank-style competitive programming drills using the standard `BufferedReader`/fast-IO template. Short, constraint-driven problems where the trick is usually a **counting or frequency observation** rather than a complex algorithm.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Migration_of_Birds.java`](Migration_of_Birds.java) | Find the most frequently observed bird species; ties → smallest id | O(n) | O(1) (≤5 types) |
| [`Divisible_Sum_Pairs.java`](Divisible_Sum_Pairs.java) | Count pairs `(i, j)` with `i < j` where `arr[i] + arr[j]` is divisible by k | O(n²) | O(1) |

## 🧭 General Approach

- Read the constraints first - they decide between O(n²) brute force and O(n)/O(n log n) solutions.
- Pair-counting problems → a frequency array keyed by `sum % k` or `value % k` usually linearizes them (`Divisible_Sum_Pairs` stays at the O(n²) baseline).
- Keep the boilerplate I/O template ready; the logic is the part worth practicing.

*Solutions, `//TODO:` problem statements and complexity comments are inside the files.*
