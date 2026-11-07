# 🎨 Patterns

## Topic Gist

Pattern printing is the classic **nested-loops** warm-up for DSA. Every pattern is just rows x columns logic: an outer loop for rows, inner loop(s) for stars/numbers/spaces, and a derived formula connecting the row index to what gets printed. This folder covers the full beginner set - triangles, pyramids, diamonds, butterflies, Floyd's triangle, Pascal's triangle and more.

> 📄 **`PATTERN_RULES.txt`** - A universal 3-step method for attacking *any* pattern: analyze structure → determine loop count → **derive formulas** (the most important step). Read this before solving new patterns.

## 📚 Index

| File | Pattern | Time | Space |
|------|---------|------|-------|
| [`Pattern1.java`](Pattern1.java) | Right-angled star triangle (increasing rows) | O(n²) | O(1) |
| [`Pattern2.java`](Pattern2.java) | Number triangle - increasing sequence per row (`1 / 12 / 123`) | O(n²) | O(1) |
| [`Pattern3.java`](Pattern3.java) | Descending number triangle (`1 / 21 / 321`) | O(n²) | O(1) |
| [`Pattern4.java`](Pattern4.java) | Row number repeated (`1 / 22 / 333`) | O(n²) | O(1) |
| [`Pattern5.java`](Pattern5.java) | Inverted star triangle (decreasing rows) | O(n²) | O(1) |
| [`Pattern6.java`](Pattern6.java) | Inverted number triangle (`12345 / 1234 / ...`) | O(n²) | O(1) |
| [`Pattern7.java`](Pattern7.java) | Pyramid - leading spaces + centered stars | O(n²) | O(1) |
| [`Pattern8.java`](Pattern8.java) | Increasing-then-decreasing star column pattern | O(n²) | O(1) |
| [`Pattern9.java`](Pattern9.java) | Inverted right-aligned pyramid | O(n²) | O(1) |
| [`Pattern10.java`](Pattern10.java) | Diamond - centered, increasing then decreasing | O(n²) | O(1) |
| [`Pattern11.java`](Pattern11.java) | Hollow rectangle - border only | O(n²) | O(1) |
| [`Pattern12.java`](Pattern12.java) | Number triangle - row number repeated (annotated with sample output) | O(n²) | O(1) |
| [`Pattern13.java`](Pattern13.java) | Floyd's Triangle - sequential numbers | O(n²) | O(1) |
| [`Pattern14.java`](Pattern14.java) | Butterfly - mirror wings | O(n²) | O(1) |
| [`Pattern15.java`](Pattern15.java) | Palindromic number pyramid (centered) | O(n²) | O(1) |
| [`Pattern16.java`](Pattern16.java) | Pascal's Triangle - binomial coefficients | O(n²) | O(1) |
| [`Pattern17.java`](Pattern17.java) | Hourglass - reverse pyramid + pyramid | O(n²) | O(1) |

*(n = number of rows; each pattern prints n rows of up to ~2n characters)*

## 🧭 General Approach

1. **Draw the pattern** on paper with row numbers before coding.
2. Count what changes per row (stars / spaces / numbers) and whether it's increasing or decreasing.
3. Derive the formula (e.g. `spaces = n - i - 1`, `stars = 2*i - 1`) and plug it into the inner loops.
4. Two-part patterns (diamond, butterfly, hourglass) = two outer loops or a symmetric condition.

*Each file prints its own output with sample values in `main` - run it directly to see the pattern.*
