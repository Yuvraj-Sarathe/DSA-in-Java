# 📐 Array Operations (Basic Maths)

## Topic Gist

Applying pure math to arrays - **sorting, carry propagation, difference checks and set-based duplicate detection** - without reaching for advanced data structures. Several problems come in **brute-force and optimized pairs** so the complexity jump is visible.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`AP.java`](AP.java) | Check whether an array can be rearranged into an arithmetic progression (sort + diff check) | O(n log n) | O(1) |
| [`Plus1.java`](Plus1.java) | Add 1 to a number represented as a digit array (carry from the right) | O(n) | O(1) |
| [`Closest_Number_to_Zero.java`](Closest_Number_to_Zero.java) | Find the element closest to zero (positive wins ties) | O(n) | O(1) |
| [`DuplicateB.java`](DuplicateB.java) | Contains duplicate - **brute force**: sort + scan adjacent | O(n log n) | O(1) |
| [`DuplicateO.java`](DuplicateO.java) | Contains duplicate - **optimized**: HashSet single pass | O(n) | O(n) |
| [`Square_of_SortedArray.java`](Square_of_SortedArray.java) | Squares of a sorted array - square then sort (baseline) | O(n log n) | O(n) |
| [`Square_of_SortedArray_OP.java`](Square_of_SortedArray_OP.java) | Same problem - **optimized** O(n) two-pointer version | O(n) | O(n) |

## 🧭 General Approach

- Sorted-array questions often allow **O(n)** two-pointer solutions instead of sorting again.
- Carry/bottom-up questions (`Plus1`) start at the **end** of the array.
- Read the `B` (bad/brute) → `O` (optimized) pairs in order to see the optimization reasoning.

*Complexity analysis and walkthroughs are inside each file.*
