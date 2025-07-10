## 🚀 Day 1 - Data Types

This is my solution for **Day 1** of the [HackerRank 30 Days of Code](https://www.hackerrank.com/domains/tutorials/30-days-of-code) challenge.

### 📝 Problem Statement:
- Declare and read `int`, `double`, and `String` types.
- Perform operations:
  - Add integers
  - Add doubles (to 1 decimal place)
  - Concatenate strings

### ❗ What I Learned:
- How to use `Scanner` for input in Java
- Why `scan.nextLine()` is important after `nextInt()` / `nextDouble()`
- How to format output using `System.out.printf()`
- How small bugs (like an extra space or newline) can break test cases

### 🧩 My Debugging Journey:
I was stuck when the string input was being skipped. Turns out, `nextLine()` was picking up the leftover newline. I fixed it by adding an extra `scan.nextLine()` after reading the double — that one line made everything work!

### 📌 Sample Input:
