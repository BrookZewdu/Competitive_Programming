# 120. Triangle

Medium

Given a `triangle` array, return _the minimum path sum from top to bottom_.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index `i` on the current row, you may move to either index `i` or index `i + 1` on the next row.

**Example 1:**

<pre>
**Input:** triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
**Output:** 11
**Explanation:** The triangle looks like:
   <u>2</u>
  <u>3</u> 4
 6 <u>5</u> 7
4 <u>1</u> 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
</pre>

**Example 2:**

<pre>
**Input:** triangle = [[-10]]
**Output:** -10
</pre>

**Constraints:**

* `1 <= triangle.length <= 200`
* `triangle[0].length == 1`
* `triangle[i].length == triangle[i - 1].length + 1`
* `-10<sup>4</sup> <= triangle[i][j] <= 10<sup>4</sup>`

**Follow up:** Could you do this using only `O(n)` extra space, where `n` is the total number of rows in the triangle?

Accepted `396.4K` Submissions `789.4K`
