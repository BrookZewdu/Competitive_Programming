class Solution {
    private int max = 0;
    int len = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    len = 0;
                    dfs(grid, i, j);
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }
    private void dfs(int[][] grid, int row, int col){
        if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1) return;  
        grid[row][col] = 0;
        len++;
        
        if(row > 0 && grid[row - 1][col] == 1) dfs(grid, row - 1, col);
        if(col > 0 && grid[row][col - 1] == 1) dfs(grid, row, col - 1);
        if(row < grid.length - 1 && grid[row + 1][col] == 1) dfs(grid, row + 1, col);
        if(col < grid[0].length - 1 && grid[row][col + 1] == 1) dfs(grid, row, col + 1);
    }
}