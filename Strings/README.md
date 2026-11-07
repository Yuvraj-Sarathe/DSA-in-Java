# 🔤 Strings

## Topic Gist

String problems beyond the basics: **mapping-based matching (isomorphism) and frequency-based reordering**, split into Easy and Medium by difficulty. The recurring tools are `HashMap` for character/word mappings and bucket arrays for frequency counts.

## 📚 Table of Contents

| Subfolder | Gist | Files |
|-----------|------|-------|
| [`Easy/`](Easy/) | Single-pass mapping checks, rotations, odd-digit prefix, common prefix | 4 |
| [`Medium/`](Medium/) | Frequency bucket sort — sort characters by count | 1 |

## 🧭 General Approach

- **Bijection / mapping problems** → one `HashMap` for the forward mapping plus a `Set` (or second map) to guarantee the reverse direction is unique.
- **"Same structure?" problems** (rotation, anagram, isomorphism) → normalize (rotate via `s+s`, count frequencies) and compare.
- **Frequency reordering** → count once, then bucket by frequency (max frequency ≤ n), rebuilding in O(n) instead of sorting the count map.

*Complexity is documented in each file's `//TODO:` header; each subfolder README has its own index.*
