# 🧮 Basic Maths

## Topic Gist

The mathematical foundation of DSA — everything here relies on **modulus, division, digit manipulation, divisor loops and sieves** instead of data structures. This is the Striver "Basic Maths" section plus extras, organized into six subfolders by technique. Many problems exist in **multiple versions** (brute force → optimized) so the evolution is visible side by side.

## 📂 Subfolder Index

| Subfolder | Gist | Files |
|-----------|------|-------|
| [`Array_Operations/`](Array_Operations/) | Math applied to arrays: AP check, plus-one carry propagation, duplicates, sorted squares, closest-to-zero | 7 |
| [`Divisors/`](Divisors/) | Finding/counting divisors, perfect numbers (√n optimization), ugly numbers | 5 |
| [`HCF_LCM/`](HCF_LCM/) | Euclidean HCF and the `LCM = (a*b)/HCF` relationship | 3 |
| [`Miscellaneous/`](Miscellaneous/) | One-offs: fast exponentiation, square root, trailing zeroes, Excel column numbering, pivot integer, power-of-N checks | 9 |
| [`Modulus_Digit/`](Modulus_Digit/) | Extracting/reversing digits: palindrome, Armstrong, happy number, self-dividing numbers, repunits | 10 |
| [`Sieve_Prime/`](Sieve_Prime/) | Primality done right: Sieve of Eratosthenes, primes in range, smallest-prime-factor factorization | 4 |

## 🧭 General Approach

- **Digit problems** → repeatedly `n % 10` / `n / 10`; never convert to string unless it simplifies a lot.
- **Divisor problems** → loop only to `√n`; pair each divisor `i` with `n/i`.
- **Prime problems** → trial division is fine for one number; use the **Sieve** for ranges.
- **Optimization pairs** (`X` vs `X_OP` / `XOptimized`) → read the slower one first, then the optimized file to see what changed.

| Optimization pair | Brute force | Optimized |
|---|---|---|
| Duplicates | `DuplicateB` — O(n log n) sort | `DuplicateO` — O(n) set |
| Sorted squares | `Square_of_SortedArray` — O(n log n) | `Square_of_SortedArray_OP` — O(n) two-pointer |
| Perfect number | `PerfectNumber` — O(n) | `PerfectNumberOP` — O(√n) |
| Divisors | `DivisorsOP` — O(n) | `Divisors` — O(√n) |
| LCM | `LCM` — O(min(a,b)) | `LCM2` — O(log min) |
| Unique char | `Unique_char` — O(n²) | `Unique_char_O` — O(n) |
| Happy number | `HappyNumber` — O(k) space | `HappyNumberOptimized` — O(1) space |

*Approach and complexity notes for each problem live inside the individual `.java` files.*
