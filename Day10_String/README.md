# 📚 Day 10 – Strings

Welcome to **Day 10** of my **DSA in Java** learning journey.

Today, I focused on **Strings in Java**. I practiced string traversal, vowel counting, palindrome checking, anagram detection, substring operations, lexicographical comparison, uppercase conversion, and string compression. These problems strengthened my understanding of string manipulation and improved my logical thinking for interview-level DSA questions.

---

# 🚀 Topics Covered

* Introduction to Strings
* String Traversal
* Character Access using `charAt()`
* String Length using `length()`
* Palindrome
* Anagrams
* Character Frequency
* Substrings
* Lexicographical Comparison
* Uppercase Conversion
* String Compression
* `StringBuffer`
* `intern()` Method
* String Pool

---

# 📝 Practice Questions

| Program              | Problem                                |
| -------------------- | -------------------------------------- |
| PQ1_VowelsCount      | Count Lowercase Vowels in a String     |
| PQ2                  | String Practice Problem                |
| PQ3                  | String Practice Problem                |
| PQ4_Anagrams         | Check Whether Two Strings Are Anagrams |
| Q1_Palindrome        | Check Whether a String Is Palindrome   |
| Q2_Shortest          | Find Shortest String                   |
| Q3_SubString         | Find and Work with Substrings          |
| Q4_LargestString     | Find Largest String                    |
| Q5_UperCase          | Convert String to Uppercase            |
| Q6_StringCompression | Compress a String                      |

---

# 💡 Key Concepts Learned

## 🔹 String Traversal

Learned how to traverse each character of a String using a loop and `charAt()`.

```java
for (int i = 0; i < str.length(); i++) {
    System.out.println(str.charAt(i));
}
```

---

## 🔹 Count Lowercase Vowels

Counted the number of lowercase vowels:

```text
a, e, i, o, u
```

Example:

```text
Input: education
Output: 5
```

Used character comparison and traversal to count the vowels efficiently.

---

## 🔹 Anagrams

Learned how to check whether two strings contain the same characters with the same frequency.

Example:

```text
race
care
```

Both contain:

```text
r → 1
a → 1
c → 1
e → 1
```

Therefore, they are **Anagrams**.

Used a frequency array:

```java
int[] st = new int[26];
```

Time Complexity:

```text
O(n)
```

---

## 🔹 Palindrome

Learned how to check whether a String reads the same from both directions.

Examples:

```text
madam
level
racecar
```

Technique Used:

* Compare characters from both ends.
* Move towards the center.
* If all characters match, the String is a palindrome.

---

## 🔹 Substring

Learned how to extract a portion of a String using:

```java
str.substring(start, end);
```

Example:

```text
String = "HelloWorld"

substring(0, 5)

Output:
Hello
```

---

## 🔹 Finding Largest String

Learned how to compare Strings using **lexicographical order**.

Java method used:

```java
str1.compareTo(str2);
```

This compares Strings similar to dictionary order.

---

## 🔹 Uppercase Conversion

Learned how to convert a String into uppercase using:

```java
str.toUpperCase();
```

Example:

```text
Input:
hello java

Output:
HELLO JAVA
```

---

## 🔹 String Compression

Learned how to compress repeated characters.

Example:

```text
Input:
aaabbc

Output:
a3b2c
```

This problem helped in understanding:

* Character traversal
* Counting consecutive characters
* String manipulation

---

## 🔹 `intern()` Method

Learned about the `intern()` method and the **String Pool**.

```java
String str = new String("Hello");

String pooled = str.intern();
```

The `intern()` method returns the canonical String reference from the String Pool.

---

## 🔹 StringBuffer

Learned that `StringBuffer` is a **mutable and synchronized** class.

Example:

```java
StringBuffer sb = new StringBuffer("Hello");

sb.append(" Java");

System.out.println(sb);
```

Output:

```text
Hello Java
```

Common methods practiced:

* `append()`
* `insert()`
* `delete()`
* `reverse()`

---

# 📂 Folder Structure

```text
Day10_String/
│
├── src/
│   ├── PQ1_VowelsCount.java
│   ├── PQ2.java
│   ├── PQ3.java
│   ├── PQ4_Anagrams.java
│   ├── Q1_Palindrome.java
│   ├── Q2_Shortest.java
│   ├── Q3_SubString.java
│   ├── Q4_LargestString.java
│   ├── Q5_UperCase.java
│   └── Q6_StringCompression.java
│
├── Day10_String.iml
└── README.md
```

---

# 📈 Day 10 Progress

* ✅ Programs Completed: **10**
* 📚 Main Topic: **Strings**
* 🎯 Concepts Practiced:

    * String Traversal
    * Vowel Counting
    * Palindrome
    * Anagram
    * Substring
    * Lexicographical Comparison
    * Uppercase Conversion
    * String Compression
    * `StringBuffer`
    * `intern()`
    * String Pool

---

# 🎯 Learning Outcome

After completing Day 10, I can confidently:

* Traverse and manipulate Strings in Java.
* Count characters and vowels.
* Check whether two Strings are anagrams.
* Check whether a String is a palindrome.
* Work with substrings.
* Compare Strings lexicographically.
* Convert Strings to uppercase.
* Perform basic String compression.
* Understand String immutability.
* Understand the String Pool and `intern()`.
* Use `StringBuffer` for mutable String operations.

---

# 🚀 Next Learning

* StringBuilder
* Character Arrays
* Sorting Algorithms
* Hashing
* Recursion
* Bit Manipulation
* More LeetCode Problems

---

# 📌 About This Journey

This repository is part of my **Java + DSA Learning Journey**, where I practice coding every day to strengthen my programming skills and prepare for software engineering interviews.

⭐ Every day brings new concepts, better problem-solving techniques, and continuous improvement.

---

# ✨ Day 10 Completed Successfully!

> **Consistency + Practice + Problem Solving = Growth 🚀💻**
