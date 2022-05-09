# 28. Implement strStr()

Implement [strStr()](http://www.cplusplus.com/reference/cstring/strstr/).

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

**Clarification:**

What should we return when `needle` is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's [strstr()](http://www.cplusplus.com/reference/cstring/strstr/) and Java's [indexOf()](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)).

**Example 1:**

<pre>
**Input:** haystack = "hello", needle = "ll"
**Output:** 2
</pre>

**Example 2:**

<pre>
**Input:** haystack = "aaaaa", needle = "bba"
**Output:** -1
</pre>

**Constraints:**

* `1 <= haystack.length, needle.length <= 10<sup>4</sup>`
* `haystack` and `needle` consist of only lowercase English characters.

Accepted `1,237,615` Submissions `3,445,792`
