# 🔀 Sorting

## Topic Gist

Classic comparison-based sorting algorithms implemented from scratch — the baseline O(n²) family before moving to O(n log n) divide-and-conquer sorts. Each algorithm exists in an **iterative and a recursive** variant so the loop↔recursion translation can be compared directly.

## 📚 Index

| File | Algorithm | Time | Space |
|------|-----------|------|-------|
| [`BubbleSort.java`](BubbleSort.java) | Bubble Sort — swap adjacent out-of-order pairs (early exit if sorted) | O(n²) avg, O(n) best | O(1) |
| [`SelectionSort.java`](SelectionSort.java) | Selection Sort — pick the minimum of the unsorted suffix each pass | O(n²) | O(1) |
| [`InsertionSort.java`](InsertionSort.java) | Insertion Sort — grow a sorted prefix by inserting each element | O(n²) avg, O(n) best | O(1) |
| [`RecBubble.java`](RecBubble.java) | Recursive Bubble Sort — one full bubbling pass per recursion level | O(n²) | O(n) stack |
| [`RecInsert.java`](RecInsert.java) | Recursive Insertion Sort — sort n−1, then insert the last element | O(n²) | O(n) stack |

## 🧭 General Approach

- **Bubble** → pass through swapping neighbors; a pass with no swaps means sorted (the early-exit check is what gives O(n) best case).
- **Selection** → scan the suffix for the minimum, swap it into place; always O(n²) regardless of input.
- **Insertion** → like sorting cards; the go-to for small or nearly-sorted arrays.
- **Recursive variants** → each does "sort the first n−1 elements, then fix up position n"; the recursion depth is n.

*Complexity is documented in each file's `//TODO:` header.*
