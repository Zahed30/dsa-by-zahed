# 📘 DSA by Zahed

### This repository contains my complete **DSA (Data Structures & Algorithms)** journey using **Java**.

---

## 📅 Progress Tracker  

| S.no | Topic              | Status    |
|-----|--------------------|-----------|
| 1   | Array Foundations  | ✅ Done    |
| 2   | Linear Search      | ✅ Done    |
| 3   | Binary Search      | ✅ Done    |
| 4   | Binary variations  | ✅ Done    |
| 5   | Bubble Sort        | ✅ Done    |
| 6   | Selection Sort     | ✅ Done    |
| 7   | Insertion Sort     | ✅ Done    |
| 8   | Two Pointers       | ✅ Done    |
| 9   | Sliding Window     | ✅ Done    |
| 10  | Merge Sort         | ⏳ After Recursion |

---

# 📁 01. Array Foundations

### 🟢 Day 1: Traversal & Prefix Sum
*Focus: Indexing, Linear Scanning, and Prefix Sum logic.*
- **BuildArray.java** (LC 1920) → Understanding array mapping.
- **RunningSum.java** (LC 1480) → Implementation of prefix sum logic.
- **PivotIndex.java** (LC 724) → Finding equilibrium using total sum.



### 🟢 Day 2: Optimization & Greedy
*Focus: Greedy approach and Kadane’s Algorithm.*
- **BestTimeToBuySellStock.java** (LC 121) → Single-pass greedy approach for max profit.
- **MaximumSubarray.java** (LC 53) → Implementation of **Kadane’s Algorithm**.



---

# 🔍 Searching  

### ✅ Linear Search  
- `LinearSearch.java` → Searches for a number in an integer array. 
- `LinearSearchString.java` → Searches for a word in a string array. 

🧠 **Time Complexity**: $O(n)$

---

# 📌 Binary Search  

Binary Search is a highly efficient searching algorithm used on **sorted arrays**. 
It works by repeatedly **dividing the search range in half** until the target is found or the range becomes empty. 

---

## ⚡ Types Implemented  

1. **Normal Binary Search** – Works on ascending sorted arrays.
2. **Order-Agnostic Binary Search** – Works for both ascending and descending arrays.
3. **Binary Search Variations**:
   - `Ceiling.java` → Find the smallest element greater than or equal to the target.
   - `floor.java` → Find the largest element smaller than or equal to the target.
   - `FirstAndLastPosition.java` → Find first/last occurrence.
   - `CountRotation.java` → Find how many times a sorted array is rotated.
   - `Rotated.java` → Search in a rotated sorted array.
   - `Smallest.java` → Find the minimum element in a rotated sorted array.
   - `Mountain.java` → Peak index in a mountain array.
   - `SplitArray.java` → Split array to minimize largest sum.
   - `RowColMatrix.java` → Search in a sorted 2D matrix (row-column sorted).
   - `SortedMatrix.java` → Binary search on a fully sorted 2D matrix.

---

## ⏳ Time Complexity  

| Case        | Complexity |
|------------|------------|
| **Best** | $O(1)$ |
| **Worst** | $O(\log n)$ |

---

💡 **Tip:** Binary Search only works on **sorted** arrays. 

---

# 📁 Sorting

### 🔸 Topics Covered:
- **Bubble Sort**: Swapping adjacent elements.
- **Selection Sort**: Finding min element and placing at correct position.
- **Insertion Sort**: Building a sorted portion step by step.

### ⏱️ Time Complexities:

| Algorithm      | Best Case   | Average Case | Worst Case   | Space Complexity |
|----------------|-------------|--------------|--------------|------------------|
| Bubble Sort    | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ |
| Selection Sort | $O(n^2)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ |
| Insertion Sort | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ |

---

# 📁 Two Pointers  

### 🔸 Topics Covered:
- Concept of **two pointers technique** to reduce time complexity.
- Solving problems using left and right pointers.
- Optimized solutions for array/string problems.

### ⏱️ Time Complexities (General):

| Problem                           | Time Complexity | Space Complexity |
|----------------------------------|-----------------|------------------|
| Reverse String                   | $O(n)$ | $O(1)$ |
| Palindrome Check                 | $O(n)$ | $O(1)$ |
| Pair Sum in Sorted Array         | $O(n)$ | $O(1)$ |
| Move Zeroes to End               | $O(n)$ | $O(1)$ |
| Remove Duplicates from Sorted    | $O(n)$ | $O(1)$ |
| Container With Most Water        | $O(n)$ | $O(1)$ |
| Sort Colors (Dutch National Flag)| $O(n)$ | $O(1)$ |
| Squares of Sorted Array          | $O(n)$ | $O(n)$ |
| Trapping Rain Water              | $O(n)$ | $O(1)$ |
| 3Sum                             | $O(n^2)$ | $O(1)$ |



---

👨‍💻 **Author**: Zahed Hussain  
🎓 BCA Final Year | SDE Aspirant