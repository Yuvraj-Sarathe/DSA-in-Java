# 📊 HCF & LCM

## Topic Gist

The classic number-theory pair: **Highest Common Factor (HCF/GCD)** via the Euclidean algorithm, and **LCM** derived from the identity `HCF × LCM = a × b`.

## 📚 Index

| File | Topic | Time | Space |
|------|-------|------|-------|
| [`HCF.java`](HCF.java) | Euclidean algorithm for HCF/GCD (recursive) | O(log min(a,b)) | O(log min(a,b)) |
| [`LCM.java`](LCM.java) | LCM - brute force, step from `max(a,b)` to `a*b` | O(min(a,b)) worst | O(1) |
| [`LCM2.java`](LCM2.java) | LCM optimized via `LCM = (a*b)/HCF` with recursive Euclidean HCF | O(log min(a,b)) | O(log min(a,b)) |

## 🧭 General Approach

- **Euclidean algorithm**: `HCF(a, b) = HCF(b, a % b)` until `b == 0` - runs in O(log min(a,b)).
- Never loop to `min(a,b)` for LCM; compute HCF first and use the product identity.
- Both files are small - read `LCM2.java` for the interview-standard implementation.

*Implementation notes are commented in the files.*
