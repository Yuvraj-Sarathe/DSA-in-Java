# 🔢 Modulus & Digit Manipulation

## Topic Gist

The largest subfolder: every problem here is solved by **extracting digits with `% 10` and `/ 10`**, then rebuilding or analysing them. Palindromes, Armstrong numbers, happy numbers, self-dividing numbers and repunits - all digit-loop classics.

## 📚 Index

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Count_Digits.java`](Count_Digits.java) | Count the digits of a number | O(digits) | O(1) |
| [`Number_Reversed.java`](Number_Reversed.java) | Reverse a number (with 32-bit overflow check) | O(digits) | O(1) |
| [`Palindrome.java`](Palindrome.java) | Number palindrome check (digit reversal) | O(digits) | O(1) |
| [`Armstrong_Number.java`](Armstrong_Number.java) | Armstrong number check (sum of digit cubes) | O(digits) | O(1) |
| [`Add_Digits.java`](Add_Digits.java) | Add digits until a single digit remains (digital root) | O(1) | O(1) |
| [`HappyNumber.java`](HappyNumber.java) | Happy number - sum of squared digits with visited set (baseline) | O(log n) | O(k) |
| [`HappyNumberOptimized.java`](HappyNumberOptimized.java) | Same problem - O(1) space via known 4-cycle detection | O(log n) | O(1) |
| [`Count_the_Digits_that_Divide_a_Number.java`](Count_the_Digits_that_Divide_a_Number.java) | Count digits that evenly divide the number | O(digits) | O(1) |
| [`Self_Dividing_number.java`](Self_Dividing_number.java) | Self-dividing numbers in [left, right] (every digit divides it) | O((r-l+1) × digits) | O(1) |
| [`Smallest_Int_divisible_by_K.java`](Smallest_Int_divisible_by_K.java) | Smallest repunit (1, 11, 111...) divisible by K | O(k) | O(1) |

## 🧭 General Approach

- Template: `while (n > 0) { int d = n % 10; ...; n /= 10; }`
- Reversing = `rev = rev * 10 + d` on each iteration.
- Repunit problems use **modular arithmetic on the remainder** - never build the giant number itself.
- Happy numbers can loop forever → track seen states or detect the known unhappy cycle (see the optimized file).

*Full approaches are documented inside each file.*
