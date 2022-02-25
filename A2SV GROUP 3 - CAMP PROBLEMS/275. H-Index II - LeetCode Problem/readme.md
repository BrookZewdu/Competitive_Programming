# 275. H-Index II

Medium
Given an array of integers `citations` where `citations[i]` is the number of citations a researcher received for their `i<sup>th</sup>` paper and `citations` is sorted in an **ascending order**, return compute the researcher's `h`**-index**.

According to the [definition of h-index on Wikipedia](https://en.wikipedia.org/wiki/H-index): A scientist has an index `h` if `h` of their `n` papers have at least `h` citations each, and the other `n − h` papers have no more than `h` citations each.

If there are several possible values for `h`, the maximum one is taken as the `h`**-index**.

You must write an algorithm that runs in logarithmic time.

**Example 1:**

<pre>
**Input:** citations = [0,1,3,5,6]
**Output:** 3
**Explanation:** [0,1,3,5,6] means the researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
</pre>

**Example 2:**

<pre>
**Input:** citations = [1,2,100]
**Output:** 2
</pre>

**Constraints:**

* `n == citations.length`
* `1 <= n <= 10<sup>5</sup>`
* `0 <= citations[i] <= 1000`
* `citations` is sorted in **ascending order**.

Accepted

154,596

Submissions

419,307
