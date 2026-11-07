# ✅ Strings — Easy

## Topic Gist

Easy-tier string problems: **single-pass matching with a map/set**, a **substring-containment trick** for rotations, plus two classic scans — find the odd-digit prefix and shrink toward a common prefix.

## 📚 Table of Contents

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`IsomorphicStrings.java`](IsomorphicStrings.java) | Check if two strings are isomorphic — a bijection maps every character of `s` to one of `t` (LeetCode 205) | O(n) | O(k) |
| [`RotateString.java`](RotateString.java) | Check if `goal` is a rotation of `s` by concatenating `s+s` (LeetCode 796) | O(n) | O(n) |
| [`LargestOddNumber.java`](LargestOddNumber.java) | Longest prefix of `num` that is an odd number (right-to-left scan) (LeetCode 1903) | O(n) | O(n) |
| [`Prefix.java`](Prefix.java) | Longest common prefix among an array of strings (shrink-until-match) (LeetCode 14) | O(S) | O(n) |

## 🧭 General Approach

- **Isomorphic** → `HashMap<Character,Char>` for the forward mapping and a `Set<Character>` (or second map) for the reverse, so two letters never share a target and two targets never share a source.
- **Rotation** → `goal` is a rotation of `s` iff `goal` is a substring of `s+s` (and lengths match) — no explicit rotation loop needed.
- **Odd prefix** → scan right-to-left; the first odd digit means everything up to it is the answer (odd digit → odd number).
- **Common prefix** → start from `strs[0]` and trim it from the end until it's a prefix (`indexOf == 0`) of every string.

*Complexity is documented in each file's `//TODO:` header.*
