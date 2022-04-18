class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        DisjointSet ob = new DisjointSet(n);
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (isConnected[row][col] == 1)
                    ob.union(row, col);
            }
        }
        
        return ob.getComponents();
    }
    
    private class DisjointSet {
        private int[] root, rank;
        private int size, componentsRemaining;
        
        public DisjointSet (int size) {
            this.root = new int[size];
            this.rank = new int[size];
            
            this.size = componentsRemaining = size;
            
            for (int i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }
        
        public int find (int x) {
            if (root[x] == x)
                return x;
            return root[x] = find (root[x]);
        }
        
        public int getComponents () {
            return componentsRemaining;
        }
        
        public boolean isConnected(int x, int y) {
            return find (x) == find (y);
        }
        
        public void union (int x, int y) {
            int rootX = find (x);
            int rootY = find (y);
            
            if (rootX == rootY)
                return;
            
            if (rank[rootX] <= rank[rootY]) {
                root[rootX] = rootY;
                rank[rootY] += rank[rootX];
            } else {
                root[rootY] = rootX;
                rank[rootX] += rank[rootY];
            }
            
            componentsRemaining--;
        }
    }
}