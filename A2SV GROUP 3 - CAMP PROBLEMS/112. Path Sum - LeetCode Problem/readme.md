# 112. Path Sum

Easy

Given the `root` of a binary tree and an integer `targetSum`, return `true` if the tree has a **root-to-leaf** path such that adding up all the values along the path equals `targetSum`.

A **leaf** is a node with no children.

**Example 1:**![](https://assets.leetcode.com/uploads/2021/01/18/pathsum1.jpg)

<pre>
**Input:** root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
**Output:** true
**Explanation:** The root-to-leaf path with the target sum is shown.
</pre>

**Example 2:**![](https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg)

<pre>
**Input:** root = [1,2,3], targetSum = 5
**Output:** false
**Explanation:** There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
</pre>

**Example 3:**

<pre>
**Input:** root = [], targetSum = 0
**Output:** false
**Explanation:** Since the tree is empty, there are no root-to-leaf paths.
</pre>

**Constraints:**

* The number of nodes in the tree is in the range `[0, 5000]`.
* `-1000 <= Node.val <= 1000`
* `-1000 <= targetSum <= 1000`

Accepted `820,280` Submissions `1,819,724`
