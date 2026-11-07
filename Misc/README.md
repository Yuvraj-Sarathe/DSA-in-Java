# 🗄️ Miscellaneous

## Topic Gist

A small holding folder for **standalone problems that don't belong to a specific topic module** - a design/class-based problem, a classic warm-up, and a two-pointer palindrome variant.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Bank.java`](Bank.java) | Design a bank account system - `transfer` / `deposit` / `withdraw` with 1-indexed account validation and balance checks (LeetCode 2408) | O(1) per op | O(n) balances |
| [`FIZZBUZZ.java`](FIZZBUZZ.java) | Classic FizzBuzz - multiples of 3/5/both (LeetCode 412) | O(n) | O(n) output |
| [`String_Palindrome2.java`](String_Palindrome2.java) | Valid palindrome with **at most one deletion** (two-pointer + one-shot retry, LeetCode 680) | O(n) | O(1) |

## 🧭 General Approach

- Design problems (`Bank`) are about **guard clauses**: validate index and balance *before* mutating state.
- "At most one skip" palindrome variants: on mismatch, try skipping the left character **or** the right character once.
- This `String_Palindrome2` is a *different* problem from the plain palindrome checks in [`../Basics/Basic Strings/`](../Basics/Basic%20Strings/) and [`../Basics/Basic Recursion/`](../Basics/Basic%20Recursion/) - those allow no deletions.

*Approaches are explained inside each file.*
