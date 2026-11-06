# STEP Week 11 — Category C · Data Structures & Sorting Algorithms

This repository contains the complete Java and conceptual solutions for the **STEP Sem-3 Week 11 Category C** curriculum provided by CodInClub | Powered by BridgeLabz:

1. **Assignment Problems (Sorting Algorithms - Questions 1 to 5)**
2. **Category C Problem Set**:
   - **Part A — Coding Problems (Problems 1 to 10)**
   - **Part B — Quiz (Questions 1 to 10)**
   - **Part C — Concept Questions (Questions 1 to 5)**

---

## 1. Assignment Problems (Sorting Algorithms)

Implemented from scratch without using `Arrays.sort`. Each solution includes sample and custom test verifications.

| Question | Problem Name | Algorithm / Approach | File |
| :--- | :--- | :--- | :--- |
| **Question 1** | The Height Line-Up | Bubble Sort with early termination flag | [`Question1.java`](Question1.java) |
| **Question 2** | The Prize Table | Selection Sort (descending order) with swap counter | [`Question2.java`](Question2.java) |
| **Question 3** | The Library Book Shelf | Insertion Sort with state logging | [`Question3.java`](Question3.java) |
| **Question 4** | Is the Queue in Order? | Single-pass linear scan to detect first break | [`Question4.java`](Question4.java) |
| **Question 5** | The Dice Throw Tally | Counting Sort ($O(n)$ without element comparisons) | [`Question5.java`](Question5.java) |

---

## 2. Category C: Parts A, B, and C

All files are located in the [`practice_problems/`](practice_problems/) directory.

### Part A — Coding Problems

| Problem | Title | Algorithm / Technique | Complexity | File |
| :--- | :--- | :--- | :--- | :--- |
| **Problem 1** | Library Catalog Lookup | Binary Search on sorted ISBNs | $O(\log n)$ time, $O(1)$ space | [`Problem1_LibraryCatalogLookup.java`](practice_problems/Problem1_LibraryCatalogLookup.java) |
| **Problem 2** | Warehouse Bin Grid Scan | 2D Array Row-Major Scan | $O(m \cdot n)$ time, $O(1)$ space | [`Problem2_WarehouseBinGridScan.java`](practice_problems/Problem2_WarehouseBinGridScan.java) |
| **Problem 3** | Transaction Duplicate Check | Hash Set De-duplication | $O(n)$ time, $O(n)$ space | [`Problem3_TransactionDuplicateCheck.java`](practice_problems/Problem3_TransactionDuplicateCheck.java) |
| **Problem 4** | Employee ID Lookup | Hash Map Directory Indexing | $O(1)$ query, $O(n)$ space | [`Problem4_EmployeeIdLookup.java`](practice_problems/Problem4_EmployeeIdLookup.java) |
| **Problem 5** | Pair With Target Sum | Hash Set Complement Search | $O(n)$ time, $O(n)$ space | [`Problem5_PairWithTargetSum.java`](practice_problems/Problem5_PairWithTargetSum.java) |
| **Problem 6** | Best Single Trade Profit | Single-Pass Greedy Traversal | $O(n)$ time, $O(1)$ space | [`Problem6_BestSingleTradeProfit.java`](practice_problems/Problem6_BestSingleTradeProfit.java) |
| **Problem 7** | Insert Position in Sorted List | Binary Search Insertion Point | $O(\log n)$ time, $O(1)$ space | [`Problem7_InsertPositionSortedList.java`](practice_problems/Problem7_InsertPositionSortedList.java) |
| **Problem 8** | Spiral Order Traversal | 4-Boundary Clockwise Traversal | $O(m \cdot n)$ time, $O(m \cdot n)$ space | [`Problem8_SpiralOrderTraversal.java`](practice_problems/Problem8_SpiralOrderTraversal.java) |
| **Problem 9** | Pair Sum in Sorted Array | Two-Pointer Inward Search | $O(n)$ time, $O(1)$ space | [`Problem9_PairSumSortedArray.java`](practice_problems/Problem9_PairSumSortedArray.java) |
| **Problem 10** | Remove Duplicates In-Place | Two-Pointer In-Place Overwrite | $O(n)$ time, $O(1)$ space | [`Problem10_RemoveDuplicatesSortedArray.java`](practice_problems/Problem10_RemoveDuplicatesSortedArray.java) |

### Part B — Quiz (10 MCQs)
Full questions, selected options, and detailed technical rationales:
📄 [**`practice_problems/PartB_Quiz.md`**](practice_problems/PartB_Quiz.md)

### Part C — Concept Questions (5 Technical Explanations)
In-depth discussions on linear vs non-linear structures, sum rule vs product rule, real-world memory vs latency trade-offs, and hash map vs sorted array complexity:
📄 [**`practice_problems/PartC_ConceptQuestions.md`**](practice_problems/PartC_ConceptQuestions.md)

---

## How to Compile and Run

```bash
cd step-week-11-assignment-problem

# Assignment Problems (Questions 1 - 5)
javac Question1.java && java Question1
javac Question2.java && java Question2
javac Question3.java && java Question3
javac Question4.java && java Question4
javac Question5.java && java Question5

# Practice Problems (Problems 1 - 10)
cd practice_problems
javac *.java
java Problem1_LibraryCatalogLookup
java Problem2_WarehouseBinGridScan
java Problem3_TransactionDuplicateCheck
java Problem4_EmployeeIdLookup
java Problem5_PairWithTargetSum
java Problem6_BestSingleTradeProfit
java Problem7_InsertPositionSortedList
java Problem8_SpiralOrderTraversal
java Problem9_PairSumSortedArray
java Problem10_RemoveDuplicatesSortedArray
```
