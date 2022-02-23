# 23. Merge k Sorted Lists

Hard

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

_Merge all the linked-lists into one sorted linked-list and return it._

**Example 1:**

<pre>
**Input:** lists = [[1,4,5],[1,3,4],[2,6]]
**Output:** [1,1,2,3,4,4,5,6]
**Explanation:** The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
</pre>

**Example 2:**

<pre>
**Input:** lists = []
**Output:** []
</pre>

**Example 3:**

<pre>
**Input:** lists = [[]]
**Output:** []
</pre>

**Constraints:**

* `k == lists.length`
* `0 <= k <= 10<sup>4</sup>`
* `0 <= lists[i].length <= 500`
* `-10<sup>4</sup> <= lists[i][j] <= 10<sup>4</sup>`
* `lists[i]` is sorted in **ascending order**.
* The sum of `lists[i].length` will not exceed `10<sup>4</sup>`.

Accepted

1,176,028

Submissions

2,528,996
