# 📕 Basic Strings

## Topic Gist

String fundamentals through **two pointers and fixed-size frequency arrays**. Strings in Java are immutable, so "in-place" tricks work on `char[]` (reverse) or on indices (palindrome/anagram) rather than on the `String` itself. Sanitizing input (lowercase + strip non-alphanumerics) before comparing is a recurring theme.

## 📚 Table of Contents

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Reverse_String.java`](Reverse_String.java) | Reverse a character array in place (LeetCode 344) | O(n) | O(1) |
| [`PalindromeString.java`](PalindromeString.java) | Valid palindrome — letters/digits, case-insensitive (LeetCode 125) | O(n) | O(1) |
| [`Valid_Anagram.java`](Valid_Anagram.java) | Anagram check via a 256-slot ASCII frequency array (LeetCode 242) | O(n) | O(1) |

## 🧭 General Approach

- **Two pointers** → `L` from the left, `R` from the right; swap (reverse) or compare (palindrome) and move inward. O(n) time, O(1) space.
- **Sanitize first** for palindrome problems → `toLowerCase()` + `replaceAll("[^a-z0-9]", "")`, then compare.
- **Fixed alphabet** → an `int[256]` (or `int[26]`) beats a `HashMap`: counting is O(1) per character with no hashing overhead.
- Recursion twins of these problems live in [`../Basic Recursion/`](../Basic%20Recursion/) (`ReverseString.java`, `String_Palindrome.java`) — each file points at its counterpart for the other approach.

*Complexity is documented in each file's `//TODO:` header.*
