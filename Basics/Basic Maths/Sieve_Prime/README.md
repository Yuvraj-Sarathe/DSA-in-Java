# 🌟 Sieve & Prime Numbers

## Topic Gist

Primality at scale - from "is this one number prime?" to **precomputing primes for an entire range** with the Sieve of Eratosthenes, plus SPF factorization for fast decomposition of many numbers.

## 📚 Index

| File | Topic | Time | Space |
|------|-------|------|-------|
| [`Prime.java`](Prime.java) | Basic primality test for a single number (trial division to √n) | O(√n) | O(1) |
| [`Count_Prime.java`](Count_Prime.java) | Count primes below n using the Sieve of Eratosthenes | O(n log log n) | O(n) |
| [`Prime_in_Range.java`](Prime_in_Range.java) | Count primes within a range [L, R] via a sieve up to R | O(R log log R) | O(R) |
| [`SPFQ.java`](SPFQ.java) | Smallest Prime Factor sieve - precompute SPF, then factorize any number in O(log n) | O(MAX log log MAX) + O(log n)/query | O(MAX) |

## 🧭 General Approach

- Single number → trial division to `√n`.
- Many queries / ranges → **sieve**: mark multiples of each prime as composite, count what's left.
- SPF sieve upgrades factorization: repeatedly divide by `spf[n]` instead of testing candidates.
- Edge cases: numbers ≤ 1 are not prime; handle 2 separately (skip even numbers).

*Code-level details and complexity are in each file.*
