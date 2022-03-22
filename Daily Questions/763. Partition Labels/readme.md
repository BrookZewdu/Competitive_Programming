# 763. Partition Labels

Medium
You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`.

Return _a list of integers representing the size of these parts_.

**Example 1:**

<pre>
**Input:** s = "ababcbacadefegdehijhklij"
**Output:** [9,7,8]
**Explanation:**
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
</pre>

**Example 2:**

<pre>
**Input:** s = "eccbbbbdec"
**Output:** [10]
</pre>

**Constraints:**

* `1 <= s.length <= 500`
* `s` consists of lowercase English letters.

Accepted `370,801` Submissions `466,631`
