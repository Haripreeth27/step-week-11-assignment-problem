# STEP SEM-3 · CodInClub | Powered by BridgeLabz
## CATEGORY C · Part B — Quiz Solutions

---

### Q1. What is the primary purpose of a data structure?
- A. To make a program faster regardless of data growth.
- **B. To define how data is organized, stored, and accessed efficiently for specific operations.**
- C. To determine the exact execution time of an algorithm on any machine.
- D. To prevent any program from consuming too much memory.

> **Correct Answer: B**  
> **Explanation:** A data structure is a specialized format for organizing, processing, retrieving, and storing data so that target operations (e.g., insertion, search, deletion, traversal) can be performed efficiently.

---

### Q2. Which of the following describes a non-primitive data structure?
- A. Stores a single value, like an integer or a character.
- B. Its memory layout is always fixed and determined by the language.
- C. Is a basic, built-in type provided directly by a language.
- **D. Is built by combining primitive types and stores a collection of values.**

> **Correct Answer: D**  
> **Explanation:** Non-primitive data structures (e.g., Arrays, Lists, Trees, Hash Tables) are user-defined or derived structures constructed from primitive data types to store and manage collections of related values.

---

### Q3. In a 1D array, what is the time complexity for accessing an element at a known index?
- A. O(n)
- B. O(log n)
- **C. O(1)**
- D. O(n²)

> **Correct Answer: C**  
> **Explanation:** Arrays provide direct, contiguous memory indexing. The memory address is calculated using `address = base_address + index * element_size`, enabling constant time $O(1)$ random access.

---

### Q4. An algorithm processes an input of size n. If it contains a loop nested inside another loop, both iterating n times, what is the overall time complexity?
- A. O(n)
- B. O(n + n)
- **C. O(n²)**
- D. O(log n)

> **Correct Answer: C**  
> **Explanation:** Under the product rule of algorithm analysis, when an inner loop of $n$ iterations executes for each iteration of an outer loop of $n$ iterations, the total number of operations is $n \times n = n^2$, yielding $O(n^2)$.

---

### Q5. An algorithm has one loop that iterates m times over listA, followed by a second, independent loop that iterates n times over listB. What is the overall time complexity?
- A. O(m × n)
- **B. O(m + n)**
- C. O(m²)
- D. O(n²)

> **Correct Answer: B**  
> **Explanation:** Under the sum rule, independent sequential operations are additive. Since the two loops run one after the other, their runtimes add together to $O(m + n)$.

---

### Q6. Which of the following are examples of common operations performed on data structures? (Select all that apply.)
- **A. Deletion**
- B. Debugging
- **C. Traversal**
- **D. Updating**
- E. Compilation

> **Correct Answer: A, C, D**  
> **Explanation:** Deletion, Traversal, and Updating (along with Insertion and Searching) are standard data structure operations. Debugging and Compilation are software development processes, not data structure operations.

---

### Q7. A financial system stores a large number of transaction records in an array that is sorted by date. Queries for specific date ranges are very frequent, but new transactions are added only at the end of the day. Which data structure characteristic is being prioritized by sorting the array?
- A. O(1) insertion at the end.
- B. O(n) deletion at the start.
- **C. O(log n) search for date ranges.**
- D. O(n²) traversal.

> **Correct Answer: C**  
> **Explanation:** Keeping the array sorted allows binary search to find the boundaries of any date range in $O(\log n)$ time, directly optimizing the high-frequency query workload.

---

### Q8. Which data structure is typically best for scenarios requiring frequent searches and rare inserts/deletes, especially when the data needs to maintain an order?
- A. Unsorted Array
- B. Linked List
- C. Hash-based structure
- **D. Sorted Array**

> **Correct Answer: D**  
> **Explanation:** A sorted array maintains elements in strict sequential order and enables $O(\log n)$ binary search. While inserts/deletes are costly ($O(n)$), they are rare in this scenario, making the sorted array superior to hash-based structures (which are unordered) and linked lists (which cannot perform binary search).

---

### Q9. The Two-Pointer technique is most effective when working with arrays that are:
- A. Unsorted and require complex nested loops.
- B. Non-linear and represent hierarchical data.
- **C. Sorted or have an exploitable ordering property, to avoid brute-force comparisons.**
- D. Subject to frequent random access insertions and deletions.

> **Correct Answer: C**  
> **Explanation:** The two-pointer technique relies on sorted or monotonic ordering to make deterministic decisions (e.g., if sum < target, increment left pointer; if sum > target, decrement right pointer), eliminating suboptimal brute-force comparisons.

---

### Q10. What is the primary benefit of using the sliding window technique in array problems?
- A. It converts a linear data structure into a non-linear one.
- B. It guarantees an O(1) space complexity for all problems.
- **C. It avoids redundant recomputation for overlapping subproblems, often reducing time complexity from O(n × k) or O(n²) to O(n).**
- D. It only works effectively when the array is completely unsorted.

> **Correct Answer: C**  
> **Explanation:** The sliding window technique maintains running information (like window sum or counts) as the window moves across elements, adding the incoming element and subtracting the outgoing element, thereby avoiding redundant recalculations and achieving optimal linear $O(n)$ time.
