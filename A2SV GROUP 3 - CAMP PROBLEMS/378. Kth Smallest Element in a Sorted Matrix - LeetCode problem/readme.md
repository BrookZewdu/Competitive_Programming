# 378. Kth Smallest Element in a Sorted Matrix

Medium

Given an `n x n` `matrix` where each of the rows and columns is sorted in ascending order, return _the_ `k<sup>th</sup>` _smallest element in the matrix_.

Note that it is the `k<sup>th</sup>` smallest element **in the sorted order**, not the `k<sup>th</sup>` **distinct** element.

You must find a solution with a memory complexity better than `O(n<sup>2</sup>)`.

**Example 1:**

<pre>
**Input:** matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
**Output:** 13
**Explanation:** The elements in the matrix are [1,5,9,10,11,12,13,<u>**13**</u>,15], and the 8<sup>th</sup> smallest number is 13
</pre>

**Example 2:**

<pre>
**Input:** matrix = [[-5]], k = 1
**Output:** -5
</pre>

**Constraints:**

* `n == matrix.length == matrix[i].length`
* `1 <= n <= 300`
* `-10<sup>9</sup> <= matrix[i][j] <= 10<sup>9</sup>`
* All the rows and columns of `matrix` are **guaranteed** to be sorted in **non-decreasing order**.
* `1 <= k <= n<sup>2</sup>`

**Follow up:**

* Could you solve the problem with a constant memory (i.e., `O(1)` memory complexity)?
* Could you solve the problem in `O(n)` time complexity? The solution may be too advanced for an interview but you may find reading [this paper](http://www.cse.yorku.ca/~andy/pubs/X+Y.pdf) fun.

Accepted

361.1K

Submissions

609.3K
