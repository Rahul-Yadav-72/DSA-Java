# 📚 Day 11 – Bit Manipulation

Welcome to **Day 11** of my **DSA in Java** learning journey.

Today, I focused on **Bit Manipulation in Java**. I practiced bitwise operators, getting and modifying individual bits, checking even and odd numbers, checking whether a number is a power of 2, counting set bits, fast exponentiation, modulo exponentiation, XOR swapping, and other bit manipulation problems. These concepts helped me understand how numbers are represented and manipulated at the binary level.

---

# 🚀 Topics Covered

* Bit Manipulation
* Binary Representation
* Bitwise AND (`&`)
* Bitwise OR (`|`)
* Bitwise XOR (`^`)
* Binary 1's Complement (`~`)
* Binary Right Shift (`>>`)
* Binary Left Shift (`<<`)
* Get ith Bit
* Set ith Bit
* Clear ith Bit
* Update ith Bit
* Clear Last ith Bits
* Clear Range of Bits
* Check Even or Odd using Bit Manipulation
* Check Power of 2
* Count Set Bits
* Fast Exponentiation
* Modulo Exponentiation
* XOR Swap
* Add 1 to an Integer using Bit Manipulation
* Uppercase to Lowercase using Bit Manipulation

---

# 📝 Practice Questions

| Program                | Problem                                    |
| ---------------------- | ------------------------------------------ |
| `BitOperators`         | Practice Basic Bitwise Operators           |
| `Get_ithBit`           | Get the ith Bit                            |
| `Set_ithBit`           | Set the ith Bit                            |
| `Clear_itBit`          | Clear the ith Bit                          |
| `UpdateIthBit`         | Update the ith Bit                         |
| `ClearLastIthBit`      | Clear Last ith Bits                        |
| `ClearRangeOfBit`      | Clear Range of Bits                        |
| `Q1_CheckEvenOROdd`    | Check Even or Odd using Bit Manipulation   |
| `Q2_CheckPowOfTwo`     | Check Whether a Number is Power of 2       |
| `Q3_CountOfSetBit`     | Count Number of Set Bits                   |
| `FastExponentiation`   | Fast Exponentiation                        |
| `ModuloExponentiation` | Modulo Exponentiation                      |
| `PQ1`                  | Bit Manipulation Practice Problem          |
| `PQ2_Swap`             | Swap Two Numbers using XOR                 |
| `PQ3_NumAddOne`        | Add 1 to an Integer using Bit Manipulation |
| `PQ4`                  | Convert Uppercase Character to Lowercase   |

---

# 💡 Key Concepts Learned

## 🔹 Bitwise AND (`&`)

The AND operator returns `1` only when **both bits are `1`**.

Example:

```text
5 = 0101
6 = 0110

5 & 6

0101
0110
----
0100

Output = 4
```

---

## 🔹 Bitwise OR (`|`)

The OR operator returns `1` when **at least one of the bits is `1`**.

Example:

```text
5 = 0101
6 = 0110

5 | 6

0101
0110
----
0111

Output = 7
```

---

## 🔹 Bitwise XOR (`^`)

XOR returns `1` when the two bits are **different**.

Example:

```text
5 = 0101
6 = 0110

5 ^ 6

0101
0110
----
0011

Output = 3
```

Important XOR properties:

```text
a ^ a = 0
a ^ 0 = a
a ^ b ^ b = a
```

---

## 🔹 1's Complement (`~`)

The `~` operator flips every bit:

```text
0 → 1
1 → 0
```

Example:

```text
~5 = -6
```

Important identity:

```text
~n = -(n + 1)
```

---

## 🔹 Right Shift (`>>`)

Right shift moves all bits to the right.

For positive integers:

```text
a >> b = a / 2^b
```

Example:

```text
5 >> 1

0101 >> 1

0010

Output = 2
```

---

## 🔹 Left Shift (`<<`)

Left shift moves all bits to the left.

For positive integers, when no overflow occurs:

```text
a << b = a * 2^b
```

Example:

```text
5 << 2

0101 << 2

10100

Output = 20
```

---

# 🔍 Get ith Bit

Learned how to check whether the ith bit of a number is `0` or `1`.

Formula:

```text
bitMask = 1 << i
num & bitMask
```

Example:

```text
num = 5
i = 1

5 = 0101
    ↑
   bit 1

Result = 0
```

---

# 🔧 Set ith Bit

Setting a bit means making the **ith bit `1`**, regardless of whether it was originally `0` or `1`.

Formula:

```text
bitMask = 1 << i
num | bitMask
```

Example:

```text
10 = 1010
i = 2

bitMask = 0100

1010
0100
----
1110

Output = 14
```

---

# 🧹 Clear ith Bit

Clearing a bit means making the **ith bit `0`**.

Formula:

```text
bitMask = ~(1 << i)
num & bitMask
```

This operation changes the selected bit to `0` while keeping the other bits unchanged.

---

# 🔄 Update ith Bit

Learned how to update the ith bit according to the new bit value.

```text
newBit = 0 → Clear ith Bit
newBit = 1 → Set ith Bit
```

This combines the concepts of **Set Bit** and **Clear Bit**.

---

# 🔹 Check Even or Odd using Bit Manipulation

The **LSB (Least Significant Bit)** determines whether a number is even or odd.

Formula:

```text
num & 1
```

Rules:

```text
num & 1 == 0 → Even
num & 1 == 1 → Odd
```

Example:

```text
5 = 0101
1 = 0001

5 & 1 = 1

Therefore, 5 is Odd.
```

---

# ⚡ Check Whether a Number is Power of 2

Learned the important bit manipulation formula:

```text
num > 0 && (num & (num - 1)) == 0
```

A positive number is a power of 2 if it contains **only one set bit**.

Examples:

```text
1  → Power of 2
2  → Power of 2
4  → Power of 2
8  → Power of 2
16 → Power of 2

10 → Not Power of 2
```

Example:

```text
8 = 1000
7 = 0111

1000
0111
----
0000
```

Therefore, `8` is a power of 2.

---

# 🔢 Count Set Bits

Learned how to count the number of `1`s in the binary representation of an integer.

For example:

```text
10 = 1010
```

Number of set bits:

```text
2
```

This is also known as the **population count** or **Hamming weight**.

---

# 🚀 Fast Exponentiation

Fast Exponentiation is used to calculate powers efficiently.

Instead of calculating:

```text
a × a × a × a × ...
```

for every exponent value, the algorithm repeatedly squares the base and reduces the exponent by half.

Important operations:

```text
(exponent & 1) != 0 → Check current bit
exponent >> 1       → Divide exponent by 2
base = base * base  → Square the base
```

Example:

```text
2^10 = 1024
```

Time Complexity:

```text
O(log n)
```

---

# 🔢 Modulo Exponentiation

Learned how to combine **Fast Exponentiation** with the modulo operator.

Instead of calculating a very large power directly:

```text
a^n
```

we calculate the result modulo `m` during every step.

Important operations:

```java
ans = (ans * base) % mod;
base = (base * base) % mod;
```

Example:

```text
2^10 % 7

1024 % 7

Output = 2
```

Time Complexity:

```text
O(log n)
```

Space Complexity:

```text
O(1)
```

---

# 🔄 XOR Swap

Learned how to swap two numbers without using a third variable by using XOR.

```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```

Example:

```text
Before:
a = 10
b = 5

After:
a = 5
b = 10
```

This technique demonstrates the useful properties of XOR.

---

# ➕ Add 1 Using Bit Manipulation

Learned an interesting bit manipulation identity:

```text
n + 1 = -~n
```

Example:

```text
-~5 = 6
```

This works because of the way Java represents signed integers using **two's complement**.

---

# 🔤 Convert Uppercase to Lowercase

Learned how bit manipulation can be used to convert uppercase English characters into lowercase.

Example:

```text
'A' → 'a'
'B' → 'b'
'C' → 'c'
```

Using:

```java
(char)(ch | ' ')
```

The space character `' '` has ASCII value `32`, which sets the required bit for converting uppercase letters to lowercase.

Example:

```text
A = 01000001
' '=00100000
-------------
a = 01100001
```

---

# 📂 Folder Structure

```text
Day11_BitManipulation/
│
├── src/
│   ├── BitOperators.java
│   ├── ClearLastIthBit.java
│   ├── ClearRangeOfBit.java
│   ├── Clear_itBit.java
│   ├── FastExponentiation.java
│   ├── Get_ithBit.java
│   ├── ModuloExponentiation.java
│   ├── PQ1.java
│   ├── PQ2_Swap.java
│   ├── PQ3_NumAddOne.java
│   ├── PQ4.java
│   ├── Q1_CheckEvenOROdd.java
│   ├── Q2_CheckPowOfTwo.java
│   ├── Q3_CountOfSetBit.java
│   ├── Set_ithBit.java
│   └── UpdateIthBit.java
│
├── Day11_BitManipulation.iml
└── README.md
```

---

# 📈 Day 11 Progress

* ✅ Programs Completed: **16**
* 📚 Main Topic: **Bit Manipulation**
* 🎯 Concepts Practiced:

    * Bitwise AND
    * Bitwise OR
    * Bitwise XOR
    * 1's Complement
    * Right Shift
    * Left Shift
    * Get ith Bit
    * Set ith Bit
    * Clear ith Bit
    * Update ith Bit
    * Clear Last ith Bits
    * Clear Range of Bits
    * Even/Odd Checking
    * Power of 2
    * Count Set Bits
    * Fast Exponentiation
    * Modulo Exponentiation
    * XOR Swap
    * Add 1 using Bit Manipulation
    * Uppercase to Lowercase

---

# 🎯 Learning Outcome

After completing Day 11, I can confidently:

* Understand the basic Bit Manipulation operators in Java.
* Work with binary representations of integers.
* Get, set, clear, and update individual bits.
* Check whether a number is even or odd using its LSB.
* Check whether a number is a power of 2.
* Count set bits in an integer.
* Use XOR for swapping two numbers.
* Perform Fast Exponentiation in `O(log n)`.
* Perform Modulo Exponentiation efficiently.
* Apply bit manipulation techniques to solve programming problems.
* Understand how bit-level operations can improve algorithm efficiency.

---

# 🚀 Next Learning

* Arrays
* Sorting Algorithms
* Searching Algorithms
* Hashing
* Recursion
* Linked List
* Stack and Queue
* More DSA Problems
* More LeetCode Problems

---

# 📌 About This Journey

This repository is part of my **Java + DSA Learning Journey**, where I practice coding every day to strengthen my programming skills and prepare for software engineering interviews.

⭐ Every day brings new concepts, better problem-solving techniques, and continuous improvement.

---

# ✨ Day 11 Completed Successfully!

> **Consistency + Practice + Problem Solving = Growth 🚀💻**
