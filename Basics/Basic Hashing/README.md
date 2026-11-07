# #️⃣ Hashing

## Topic Gist

Using **frequency arrays and hash maps/sets** to trade memory for speed — turning naive O(n²) lookups into O(n). The folder starts with raw array-based hashing (number/alphabet frequency precomputation) and then applies `HashMap`/`HashSet` to classic interview problems: two sum, anagrams, majority element, duplicates and more.

## 📚 Index

### Fundamentals (array-based hashing)

| File | Concept | Time | Space |
|------|---------|------|-------|
| [`NumberHashing.java`](NumberHashing.java) | Frequency array over numeric values (0–12) | O(n) | O(1) |
| [`LowecaseAlphabetHashing.java`](LowecaseAlphabetHashing.java) | 26-size alphabet frequency array (`c - 'a'` trick) + queries | O(n + q) | O(26) |
| [`BothcaseAlphabet.java`](BothcaseAlphabet.java) | ASCII-wide (256) frequency hashing + queries | O(n + q) | O(256) |
| [`Frequency_of_each_element_in_the_array.java`](Frequency_of_each_element_in_the_array.java) | Count occurrences of every element | O(n) | O(u) |

### Problem set (map/set-based)

| File | Problem | Time | Space |
|------|---------|------|-------|
| [`Two_Sum.java`](Two_Sum.java) | Pair summing to target | O(n) | O(n) |
| [`Valid_Anagram.java`](Valid_Anagram.java) | Two-string anagram check (HashMap version; array version in [`../Basic Strings/`](../Basic%20Strings/)) | O(n) | O(k) |
| [`Word_Pattern.java`](Word_Pattern.java) | Bijection between pattern letters and words | O(n) | O(p + w) |
| [`SingleNumber.java`](SingleNumber.java) | Element appearing once among duplicates | O(n) | O(n) |
| [`Duplicate.java`](Duplicate.java) | Detect duplicates in an array | O(n) | O(n) |
| [`Majority_Element.java`](Majority_Element.java) | Element appearing more than n/2 times | O(n) | O(u) |
| [`Intersection_of_Arrays.java`](Intersection_of_Arrays.java) | Common elements between two arrays | O(n + m) | O(n + m) |
| [`Ransom_Note.java`](Ransom_Note.java) | Can magazine letters spell the note? | O(n + m) | O(1) |
| [`Find_All_Numbers_Disappeared_in_an_Array.java`](Find_All_Numbers_Disappeared_in_an_Array.java) | Missing values in a permuted array | O(n) | O(n) |
| [`Frequency_of_most_frequent_element.java`](Frequency_of_most_frequent_element.java) | Highest and lowest frequency elements | O(n) | O(u) |
| [`Freq_of_2nd_Most_Element.java`](Freq_of_2nd_Most_Element.java) | Element with the second-highest frequency | O(n) | O(u) |
| [`FrequencySum.java`](FrequencySum.java) | Sum of the max and min frequencies | O(n) | O(u) |

*(u = number of distinct keys; q = number of queries)*

## 🧭 General Approach

- **Bounded key range** (integers ≤ 10⁶, lowercase letters) → plain `int[]` frequency array is fastest.
- **Unbounded keys** → `HashMap` for counts, `HashSet` for "seen so far" existence checks.
- Many "find the pair/duplicate" problems drop from O(n²) to O(n) the moment you ask *"have I seen this before?"*.
- Count-then-consume is the anagram/ransom-note template: build frequencies from one input, decrement while scanning the other.

*Each file documents its own approach and complexity.*
