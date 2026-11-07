# 🔡 Strings — Medium

## Topic Gist

Medium-tier string processing: **bucket (counting) sort** to reorder characters by frequency without an actual comparison sort.

## 📚 Table of Contents

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`SortbyFreq.java`](SortbyFreq.java) | Sort a string by decreasing character frequency (LeetCode 451) | O(n) | O(n) |

## 🧭 General Approach

1. **Count** each character in a `HashMap` (O(n)).
2. **Bucket** characters by frequency: `List<Character>[] buckets` of size `n+1`, since a character's frequency is at most `n` (O(n)).
3. **Rebuild** the result from the highest bucket downward (O(n)).

Total O(n) — better than sorting the map entries (O(k log k)) when the alphabet is large.

*Complexity and the step-by-step example are commented inside the file.*
