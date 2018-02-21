# Dynamic Programming   
It is an algorithmic paradigm where we solve a given complex problem by breaking it into subproblems and store the result of subproblems to avoid computing them again.
It is quite similar to divide and conquer with the difference of overlapping sub problems which is not the case in divide and conquer.

The problem must have two characteristics in order to be solved by DP
- Overlapping Sub Problems
- Optimal Sub Structure (when a problem can have a recursive definition)

DP problem can be solved in two ways
- Memoization
    - Works in top down fashion.
    - Sometimes avoid computing sub problems that aren't needed. e.g LCS.
    - ometimes more intiutive to write. e.g Matrix Chain Multiplication.
- Tabulation
  - Works in bottom up manner.
  - Avoid multiple lookups, saves function call overhead time.


