# 🔢 Divisors

## Topic Gist

Everything about **factorizing and testing numbers**: finding all divisors, perfect-number checks, and ugly numbers. The key optimization here is looping only up to `√n` instead of `n` - present as brute-force/optimized pairs.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`DivisorsOP.java`](DivisorsOP.java) | Print all divisors of n - naive `1..n` scan (baseline) | O(n) | O(1) |
| [`Divisors.java`](Divisors.java) | Print all divisors of n - `√n` pairing (`i` and `n/i`) | O(√n) | O(d) |
| [`PerfectNumber.java`](PerfectNumber.java) | Perfect number check - scan `1..n-1` (baseline) | O(n) | O(n) |
| [`PerfectNumberOP.java`](PerfectNumberOP.java) | Perfect number check - **O(√n)** divisor pairing | O(√n) | O(1) |
| [`Ugly_Number.java`](Ugly_Number.java) | Ugly number - only divisible by 2, 3 and 5 | O(log n) | O(1) |

*(d = number of divisors of n)*

## 🧭 General Approach

- Divisors come in pairs `(i, n/i)` - iterate to `√n` and collect both.
- Perfect number = sum of proper divisors equals the number itself; the `√n` version halves the work per query.
- Ugly number = keep dividing by 2, 3, 5; if you're left with 1 → ugly.

*Approach details live inside each file.*
