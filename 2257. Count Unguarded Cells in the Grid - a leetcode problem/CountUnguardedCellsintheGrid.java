class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 2;
        }
        
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 1;
        }
        int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for (int[] guard : guards) {
            int row = guard[0], col = guard[1];
            for (int[] dir : dirs) {
                int new_r = row + dir[0];
                int new_c = col + dir[1];
                while(inBound(new_r, new_c, m, n) && (grid[new_r][new_c] == 0 || grid[new_r][new_c] == -1)) {
                    grid[new_r][new_c] = -1;
                    new_r = new_r + dir[0];
                    new_c = new_c + dir[1];
                }
            }
            
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean inBound(int row, int col, int m, int n) {
        if (0 <= row && row < m && 0 <= col && col < n)
            return true;
        return false;
    }
}