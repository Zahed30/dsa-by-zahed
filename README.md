# 📘 DSA by Zahed

### This repository contains my complete **DSA (Data Structures & Algorithms)** journey using **Java**.

---

## 📅 Progress Tracker  

| S.no | Topic              | Status    |
|-----|--------------------|-----------|
| 1   | Linear Search      | ✅ Done   |
| 2   | Binary Search      | ✅ Done   |
| 3  | Binary search variations     | ✅ Done |
| 4   | Bubble Sort        | ✅ Done   |
| 5   | Selection Sort     | ✅ Done   |
| 6   | Insertion Sort     | ✅ Done   |
| 7  | Two Pointers      | ✅ Done |
| 8   | Merge Sort         | ⏳ After Recursion |

---

# 🔍 Searching  

### ✅ Linear Search  
- **LinearSearch.java** → Searches for a number in an integer array.  
- **LinearSearchString.java** → Searches for a word in a string array.  

🧠 **Time Complexity**: O(n)  

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
   - `FirstAndLastPosition.java` → Find the first and last occurrence of a target in a sorted array.  
   - `CountRotation.java` → Find how many times a sorted array is rotated.  
   - `Rotated.java` → Search in a rotated sorted array.  
   - `Smallest.java` → Find the minimum element in a rotated sorted array.  
   - `Mountain.java` → Peak index in a mountain array.  
   - `SplitArray.java` → Split array to minimize largest sum.  
   - `RowColMatrix.java` → Search in a sorted 2D matrix (row-column sorted).  
   - `SortedMatrix.java` → Binary search on a fully sorted 2D matrix.  

---

## ⏳ Time Complexity  

| Case       | Complexity |
|------------|------------|
| **Best**   | O(1)       |
| **Worst**  | O(log n)   |
---

💡 **Tip:** Binary Search only works on **sorted** arrays.  
If the array is not sorted, sort it first or use a different algorithm like Linear Search.  

---
# 📁 04.Sorting

### 🔸 Topics Covered:

- Bubble Sort (basic idea & swapping adjacent elements)  
- Selection Sort (finding min element and placing at correct position)  
- Insertion Sort (building a sorted portion step by step)  

---
### ⏱️ Time Complexities:

| Algorithm      | Best Case   | Average Case | Worst Case   | Space Complexity |
|----------------|-------------|--------------|--------------|------------------|
| Bubble Sort    | O(n)        | O(n²)        | O(n²)        | O(1)             |
| Selection Sort | O(n²)       | O(n²)        | O(n²)        | O(1)             |
| Insertion Sort | O(n)        | O(n²)        | O(n²)        | O(1)             |
---

### 📂 Files:

| File                | Description                                      |
|----------------------|--------------------------------------------------|
| `BubbleSort.java`    | Implementation of Bubble Sort with example array |
| `SelectionSort.java` | Implementation of Selection Sort with example array |
| `InsertionSort.java` | Implementation of Insertion Sort with example array |

----
# 📁 05.Two Pointers  

### 🔸 Topics Covered:

- Concept of **two pointers technique** to reduce time complexity.  
- Solving problems using left and right pointers.  
- Optimized solutions for array/string problems.  

---

### ⏱️ Time Complexities (General):

| Problem                          | Time Complexity | Space Complexity |
|----------------------------------|-----------------|------------------|
| Reverse String                   | O(n)            | O(1)             |
| Palindrome Check                 | O(n)            | O(1)             |
| Pair Sum in Sorted Array         | O(n)            | O(1)             |
| Move Zeroes to End               | O(n)            | O(1)             |
| Remove Duplicates from Sorted    | O(n)            | O(1)             |
| Container With Most Water        | O(n)            | O(1)             |
| Sort Colors (Dutch National Flag)| O(n)            | O(1)             |
| Squares of Sorted Array          | O(n)            | O(n)             |
| Trapping Rain Water              | O(n)            | O(1)             |
| 3Sum                             | O(n²)           | O(1)             |

---

### 📂 Files:

| File                    | Description                                          |
|--------------------------|------------------------------------------------------|
| `ReverseString.java`     | Reverses a string using two pointers                 |
| `Palindrome.java`        | Checks if a string is a palindrome                   |
| `Pair1sum.java`          | Finds a pair with a given sum in a sorted array      |
| `MoveZeroes.java`        | Moves all zeroes to the end of an array              |
| `RemoveDuplicate.java`   | Removes duplicates from a sorted array               |
| `MostWater.java`         | Solves "Container With Most Water" problem           |
| `SortColors.java`        | Sorts 0s, 1s, and 2s using Dutch National Flag algo  |
| `SquareSorted.java`      | Returns squares of sorted array in sorted order      |
| `TrappingRainWater.java` | Calculates trapped rainwater using two pointers      |
| `Ill_sum.java`           | Solves the 3Sum problem using sorting + two pointers |

----
👨‍💻 **Author**: Zahed Hussain  
🎓 BCA Final Year | SDE Aspirant  
