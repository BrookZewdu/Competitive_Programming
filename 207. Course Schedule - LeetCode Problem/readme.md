# 207. Course Schedule

Medium

There are a total of `numCourses` courses you have to take, labeled from `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [a<sub>i</sub>, b<sub>i</sub>]` indicates that you **must** take course `b<sub>i</sub>` first if you want to take course `a<sub>i</sub>`.

* For example, the pair `[0, 1]`, indicates that to take course `0` you have to first take course `1`.

Return `true` if you can finish all courses. Otherwise, return `false`.

**Example 1:**

<pre>
**Input:** numCourses = 2, prerequisites = [[1,0]]
**Output:** true
**Explanation:** There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
</pre>

**Example 2:**

<pre>
**Input:** numCourses = 2, prerequisites = [[1,0],[0,1]]
**Output:** false
**Explanation:** There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
</pre>

**Constraints:**

* `1 <= numCourses <= 10<sup>5</sup>`
* `0 <= prerequisites.length <= 5000`
* `prerequisites[i].length == 2`
* `0 <= a<sub>i</sub>, b<sub>i</sub> < numCourses`
* All the pairs prerequisites[i] are **unique**.

Accepted `836.6K` Submissions `1.9M`
