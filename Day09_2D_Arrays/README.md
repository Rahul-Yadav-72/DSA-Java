# 📚 Day 09 – Two Dimensional Arrays (2D Arrays)

Welcome to **Day 09** of my **DSA in Java** learning journey.

Today, I focused on **Two-Dimensional Arrays (Matrices)** in Java. I practiced matrix traversal, transpose, diagonal operations, spiral traversal, and searching elements in a sorted matrix. These problems strengthened my understanding of matrix manipulation and improved my logical thinking for interview-level DSA questions.

---

# 🚀 Topics Covered

- Introduction to 2D Arrays
- Matrix Representation
- Matrix Traversal
- Row and Column Operations
- Matrix Transpose
- Spiral Matrix Traversal
- Primary & Secondary Diagonal Sum
- Searching in Sorted Matrix
- Matrix Problem Solving

---

# 📝 Practice Questions

| Program | Problem |
|---------|---------|
| PQ1 | Count Number of 7's in a 2D Array |
| PQ2 | Sum of Elements in the Second Row of a Matrix |
| PQ3 | Find Transpose of a Matrix |
| Q1_SpiralMatrix | Spiral Matrix Traversal |
| Q2_DiagonalSum | Sum of Primary and Secondary Diagonal Elements |
| Q3_SearchSortedMatrix | Search in Row-wise and Column-wise Sorted Matrix |

---

# 💡 Key Concepts Learned

## 🔹 Matrix Traversal

Learned how to traverse every element of a matrix using nested loops.

```java
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
    }
}
```

---

## 🔹 Counting Specific Elements

- Traversed the complete matrix.
- Counted occurrences of a particular number (7).

---

## 🔹 Row Operations

Calculated:

- Sum of elements in a particular row
- Average of row elements
- Row-wise traversal

---

## 🔹 Matrix Transpose

Learned how to convert rows into columns.

Example:

```text
Original Matrix

1 2 3
4 5 6

Transpose

1 4
2 5
3 6
```

---

## 🔹 Spiral Matrix Traversal

Implemented Spiral Order Traversal using four boundaries:

- Top
- Bottom
- Left
- Right

Learned how to update boundaries after every traversal until all elements are visited.

---

## 🔹 Diagonal Sum

Calculated:

- Primary Diagonal Sum
- Secondary Diagonal Sum

Also handled the center element correctly for odd-sized matrices to avoid double counting.

---

## 🔹 Search in Sorted Matrix

Implemented an efficient search in a matrix sorted both row-wise and column-wise.

Technique Used:

- Start from the **top-right corner**
- Move:
    - Left if current element is greater than target.
    - Down if current element is smaller than target.

Time Complexity:

```text
O(rows + columns)
```

---

# 📂 Folder Structure

```text
Day09_2DArrays/
│
├── src/
│   ├── PQ1.java
│   ├── PQ2.java
│   ├── PQ3.java
│   ├── Q1_SpiralMatrix.java
│   ├── Q2_DiagonalSum.java
│   └── Q3_SearchSortedMatrix.java
│
├── Day09_2DArrays.iml
└── README.md
```

---

# 📈 Day 09 Progress

- ✅ Programs Completed: **6**
- 📚 Main Topic: **Two-Dimensional Arrays**
- 🎯 Concepts Practiced:
    - Matrix Traversal
    - Matrix Transpose
    - Spiral Traversal
    - Diagonal Sum
    - Searching in Sorted Matrix
    - Row Operations

---

# 🎯 Learning Outcome

After completing Day 09, I can confidently:

- Traverse and manipulate 2D arrays.
- Solve matrix-based coding problems.
- Find transpose of a matrix.
- Perform spiral traversal.
- Calculate diagonal sums.
- Search efficiently in a sorted matrix.
- Write clean and optimized Java solutions.

---

# 🚀 Next Learning

- Strings
- StringBuilder
- Character Arrays
- Sorting Algorithms
- Bit Manipulation
- More LeetCode Problems

---

# 📌 About This Journey

This repository is part of my **Java + DSA Learning Journey**, where I practice coding every day to strengthen my programming skills and prepare for software engineering interviews.

⭐ Every day brings new concepts, better problem-solving techniques, and continuous improvement.

---

# ✨ Day 09 Completed Successfully!

> **Consistency + Practice + Problem Solving = Growth 🚀💻**