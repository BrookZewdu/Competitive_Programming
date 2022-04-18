# 1584. Min Cost to Connect All Points

You are given an array `points` representing integer coordinates of some points on a 2D-plane, where `points[i] = [x<sub>i</sub>, y<sub>i</sub>]`.

The cost of connecting two points `[x<sub>i</sub>, y<sub>i</sub>]` and `[x<sub>j</sub>, y<sub>j</sub>]` is the **manhattan distance** between them: `|x<sub>i</sub> - x<sub>j</sub>| + |y<sub>i</sub> - y<sub>j</sub>|`, where `|val|` denotes the absolute value of `val`.

Return _the minimum cost to make all points connected._ All points are connected if there is **exactly one** simple path between any two points.

**Example 1:**![](https://assets.leetcode.com/uploads/2020/08/26/d.png)

<pre>
**Input:** points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
**Output:** 20
**Explanation:** 
![](https://assets.leetcode.com/uploads/2020/08/26/c.png)
We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
</pre>

**Example 2:**

<pre>
**Input:** points = [[3,12],[-2,5],[-4,1]]
**Output:** 18
</pre>

**Constraints:**

* `1 <= points.length <= 1000`
* `-10<sup>6</sup> <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>6</sup>`
* All pairs `(x<sub>i</sub>, y<sub>i</sub>)` are distinct.

Accepted `55,664` Submissions `90,524`
