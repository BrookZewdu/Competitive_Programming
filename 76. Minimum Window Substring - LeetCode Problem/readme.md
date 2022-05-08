# 76. Minimum Window Substring

Given two strings `s` and `t` of lengths `m` and `n` respectively, return _the **minimum window substring** of_ `s` _such that every character in_ `t` _(**including duplicates**) is included in the window. If there is no such substring__, return the empty string_ `""`_._

The testcases will be generated such that the answer is **unique**.

A **substring** is a contiguous sequence of characters within the string.

**Example 1:**

<pre>
**Input:** s = "ADOBECODEBANC", t = "ABC"
**Output:** "BANC"
**Explanation:** The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
</pre>

**Example 2:**

<pre>
**Input:** s = "a", t = "a"
**Output:** "a"
**Explanation:** The entire string s is the minimum window.
</pre>

**Example 3:**

<pre>
**Input:** s = "a", t = "aa"
**Output:** ""
**Explanation:** Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
</pre>

**Constraints:**

* `m == s.length`
* `n == t.length`
* `1 <= m, n <= 10<sup>5</sup>`
* `s` and `t` consist of uppercase and lowercase English letters.

**Follow up:** Could you find an algorithm that runs in `O(m + n)` time?

Accepted `749,359` Submissions `1,920,822`
