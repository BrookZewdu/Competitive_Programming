class Solution {
    private int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        DisjointSet ob = new DisjointSet(grid.length * grid[0].length);
        int max = 0;
        for (int row = 0; row < grid.length; row++) 
            for (int col = 0; col < grid[row].length; col++) 
                if (grid[row][col] == 1) {
                    max = Math.max(max, 1);
                    for (int[] dir : dirs) {
                        int new_r = row + dir[0];
                        int new_c = col + dir[1];
                        
                        if ((0 <= new_r && new_r < grid.length) &&
                            (0 <= new_c && new_c < grid[row].length) &&
                            grid[new_r][new_c] == 1) {
                            
                            int firstIdx = row * grid[row].length + col;
                            int secondIdx = new_r * grid[new_r].length + new_c;
                            ob.union(firstIdx, secondIdx);
                            max = Math.max(max, ob.getGroupSize(firstIdx));
                            
                        }
                    }
                }
            
        
        return max;
    }
    
    private class DisjointSet {
        private int size, numOfComponents;
        private int[] root, rank;
        
        public DisjointSet (int size) {
            this.size = numOfComponents = size;
            this.root = new int[size];
            this.rank = new int[size];
            
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
        
        public void union (int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            
            if ( rootX == rootY) return;
            
            if (rank[rootX] <= rank[rootY]) {
                root[rootX] = rootY;
                rank[rootY] += rank[rootX];
            } else {
                root[rootY] = rootX;
                rank[rootX] += rank[rootY];
            }
            
            numOfComponents--;
        }
        
        public boolean isConnected (int x, int y) {
            return find(x) == find(y);
        }
        
        public int getComponents () {
            return numOfComponents;
        }
        
        public int getGroupSize (int x) {
            return rank[find(x)];
        }
    }
}