# ☕ Java Collections

## Topic Gist

**Reference material, not DSA problems.** A lecture-style walkthrough (L01-L09) of Java's Collections Framework - from `ArrayList` to `Collections` utility methods - plus demos of the concepts that trip people up: `Comparable` vs `Comparator`, and `equals`/`hashCode` for custom objects in hash-based collections.

## 📚 Index

### Lecture series

| File | Topic | Typical Cost |
|------|-------|--------------|
| [`L01ARRAYLIST.java`](L01ARRAYLIST.java) | `ArrayList` - dynamic arrays | O(1) get/set, amortized O(1) add |
| [`L02Stacks.java`](L02Stacks.java) | Stack (LIFO) | O(1) push/pop/peek |
| [`L03Queue.java`](L03Queue.java) | Queue (FIFO) | O(1) enqueue/dequeue |
| [`L04ArrayDeque.java`](L04ArrayDeque.java) | `ArrayDeque` - stack/queue/deque in one | O(1) per end operation |
| [`L05HashSet.java`](L05HashSet.java) | `HashSet` - uniqueness & lookups | O(1) average |
| [`L06HashMap.java`](L06HashMap.java) | `HashMap` - key-value storage | O(1) average get/put |
| [`L07TreeMap.java`](L07TreeMap.java) | `TreeMap` - sorted keys (Red-Black tree) | O(log n) get/put |
| [`L08ArrayCollections.java`](L08ArrayCollections.java) | `Arrays` class utilities for arrays | O(1) access, O(n) sort/fill |
| [`L09Collections.java`](L09Collections.java) | `Collections` class - sorting, reversing, immutable lists, etc. | O(n log n) sort |

### Custom object demos

| File | Topic |
|------|-------|
| [`Student.java`](Student.java) | POJO with proper `equals`/`hashCode` (used in HashSet demos) |
| [`Custom.java`](Custom.java) | `HashSet<Student>` - shows why `equals`/`hashCode` matter |
| [`Custom_Collections.java`](Custom_Collections.java) | Reusable data-only POJO (no comparison logic baked in) |
| [`MovieComparable.java`](MovieComparable.java) | `Comparable` - natural order by release year |
| [`RatingComparator.java`](RatingComparator.java) | `Comparator` - external sorting by rating (descending) |
| [`ComparableVsComparatorDemo.java`](ComparableVsComparatorDemo.java) | Side-by-side comparison of both approaches (O(n log n) sorts) |

## 🧭 Key Takeaways

- **`Comparable`** = define order inside the class; **`Comparator`** = separate strategy object (multiple orders possible).
- Storing custom objects in `HashSet`/`HashMap` **requires** correct `equals` + `hashCode`, or duplicates slip through.
- Prefer `Collections.unmodifiableList(...)` / `List.of(...)` for constants; reach for `TreeMap` when you need sorted keys.
- Complexity above is **per operation** - the demo files themselves just print output.

*Each file is a runnable demo with printed output.*
