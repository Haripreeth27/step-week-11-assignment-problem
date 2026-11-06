# STEP Week 11 Assignment - Category C · Sorting Algorithms

This repository contains the complete Java solutions for the **STEP Sem-3 Week 11 Assignment Problems (Category C · Sorting Algorithms)** provided by CodInClub | Powered by BridgeLabz.

All algorithms are implemented from scratch without using `Arrays.sort`. Each solution includes the exact required method signature, verification with sample inputs, and additional custom test cases.

---

## Problems & Solutions

| Question | Problem Name | Algorithm / Approach | File |
| :--- | :--- | :--- | :--- |
| **Question 1** | The Height Line-Up | Bubble Sort with early termination flag | [`Question1.java`](Question1.java) |
| **Question 2** | The Prize Table | Selection Sort (descending order) with swap counter | [`Question2.java`](Question2.java) |
| **Question 3** | The Library Book Shelf | Insertion Sort with state logging | [`Question3.java`](Question3.java) |
| **Question 4** | Is the Queue in Order? | Single-pass linear scan to detect first break | [`Question4.java`](Question4.java) |
| **Question 5** | The Dice Throw Tally | Counting Sort (O(n) without comparing elements) | [`Question5.java`](Question5.java) |

---

## Problem Descriptions & Details

### Question 1: The Height Line-Up
- **Task:** Students line up for the class photo and the photographer arranges them from shortest to tallest by only swapping two students standing next to each other. Sort the array using Bubble Sort and print the whole line after every sweep from left to right. If a sweep makes no swap at all, the line is already in order: print that sweep and stop.
- **Method:** `public static void lineUp(int[] heights)`
- **Sample 1:** `heights = [4, 2, 5, 1]`
  - Output:
    ```
    Pass 1: [2, 4, 1, 5]
    Pass 2: [2, 1, 4, 5]
    Pass 3: [1, 2, 4, 5]
    ```
- **Sample 2:** `heights = [1, 3, 2, 4]`
  - Output:
    ```
    Pass 1: [1, 2, 3, 4]
    Pass 2: [1, 2, 3, 4]
    ```

### Question 2: The Prize Table
- **Task:** For prize distribution, sort student marks from highest to lowest using Selection Sort. In each round, find the highest mark among remaining elements and swap it into position. Count only rounds where a swap was actually made (do not count when the highest element is already in place).
- **Method:** `public static int prizeTable(int[] marks)`
- **Sample 1:** `marks = [45, 90, 60, 75]` -> `[90, 75, 60, 45] swaps = 2`
- **Sample 2:** `marks = [80, 70, 60]` -> `[80, 70, 60] swaps = 0`

### Question 3: The Library Book Shelf
- **Task:** A library helper puts books on a shelf one at a time, keeping them in increasing order. Implement Insertion Sort and print the state of the shelf after each book (from the 2nd book onwards) is placed.
- **Method:** `public static void shelf(int[] books)`
- **Sample:** `books = [30, 10, 40, 20]`
  - Output:
    ```
    After placing 10: [10, 30, 40, 20]
    After placing 40: [10, 30, 40, 20]
    After placing 20: [10, 20, 30, 40]
    ```

### Question 4: Is the Queue in Order?
- **Task:** Given an array of student token numbers, determine if they are in non-decreasing order. Return the index of the first student whose token number is smaller than the student before them, or `-1` if the queue is fully in order.
- **Method:** `public static int firstBreak(int[] tokens)`
- **Sample 1:** `tokens = [3, 5, 5, 8, 6, 9]` -> `4 (6 comes after 8)`
- **Sample 2:** `tokens = [1, 2, 2, 7]` -> `-1`

### Question 5: The Dice Throw Tally
- **Task:** A student throws a 6-sided die several times. Count occurrences of each number from 1 to 6 without comparing throws with each other (Counting Sort). Print the counts and return the sorted array.
- **Method:** `public static int[] diceSort(int[] rolls)`
- **Sample:** `rolls = [4, 1, 6, 4, 2, 1, 4]`
  - Output:
    ```
    Counts: 1:2 2:1 3:0 4:3 5:0 6:1
    Sorted: [1, 1, 2, 4, 4, 4, 6]
    ```

---

## How to Compile and Run

To compile and run any question:

```bash
cd step-week-11-assignment-problem

# Example for Question 1:
javac Question1.java
java Question1

# Example for Question 2:
javac Question2.java
java Question2

# Example for Question 3:
javac Question3.java
java Question3

# Example for Question 4:
javac Question4.java
java Question4

# Example for Question 5:
javac Question5.java
java Question5
```
