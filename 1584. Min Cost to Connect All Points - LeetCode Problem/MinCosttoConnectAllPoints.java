class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        Edge[] edges = new Edge[n * (n - 1) / 2];
        int index = 0;
        
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < n; j++) {
                edges[index++] = new Edge(i, j,
                                 Math.abs(points[i][0] - points[j][0]) + 
                                 Math.abs(points[i][1] - points[j][1]));
            }
        }
        Arrays.sort(edges);
        int ans = 0;
        DisjointSet ob = new DisjointSet(n);
        for (Edge e : edges) {
            if (ob.union(e.i, e.j))ans += e.c;
        }
        return ans;
    }
    static class Edge implements Comparable<Edge> {
        int i, j, c;
        public Edge (int i, int j, int c) {
            this.i = i;
            this.j = j;
            this.c = c;
        }
        public int compareTo (Edge o) {
            return Integer.compare(c, o.c);
        }
    }
    private class DisjointSet {
       int root[];
        
        public DisjointSet (int size) {
            Arrays.fill(root = new int[size], -1);
        }
        
        
        public int find (int x) {
            return root[x] < 0 ? x : (root[x] = find(root[x]));
        }
        
        public boolean union (int x, int y) {
            if ((x = find(x)) == (y = find(y))) return false;
            if (root[x] <= root[y]) root[x] = y; else root[y] = x;
            return true;
        }
    }
}
    