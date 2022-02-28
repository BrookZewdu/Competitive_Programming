# 33. Search in Rotated Sorted Array

Medium

There is an integer array `nums` sorted in ascending order (with **distinct** values).

Prior to being passed to your function, `nums` is **possibly rotated** at an unknown pivot index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`.

Given the array `nums` **after** the possible rotation and an integer `target`, return _the index of_ `target` _if it is in_ `nums`_, or_ `-1` _if it is not in_ `nums`.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

<pre>
**Input:** nums = [4,5,6,7,0,1,2], target = 0
**Output:** 4
</pre>

**Example 2:**

<pre>
**Input:** nums = [4,5,6,7,0,1,2], target = 3
**Output:** -1
</pre>

**Example 3:**

<pre>
**Input:** nums = [1], target = 0
**Output:** -1
</pre>

**Constraints:**

* `1 <= nums.length <= 5000`
* `-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>`
* All values of `nums` are **unique**.
* `nums` is an ascending array that is possibly rotated.
* `-10<sup>4</sup> <= target <= 10<sup>4</sup>`

Accepted `1,356,642` Submissions `3,619,079`
