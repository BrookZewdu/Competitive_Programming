# 64. Minimum Path Sum

Medium

Given a `m x n` `grid` filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

**Note:** You can only move either down or right at any point in time.

**Example 1:**![](https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg)

<pre>
**Input:** grid = [[1,3,1],[1,5,1],[4,2,1]]
**Output:** 7
**Explanation:** Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
</pre>

**Example 2:**

<pre>
**Input:** grid = [[1,2,3],[4,5,6]]
**Output:** 12
</pre>

**Constraints:**

* `m == grid.length`
* `n == grid[i].length`
* `1 <= m, n <= 200`
* `0 <= grid[i][j] <= 100`

Accepted `675.3K` Submissions `1.1M`
