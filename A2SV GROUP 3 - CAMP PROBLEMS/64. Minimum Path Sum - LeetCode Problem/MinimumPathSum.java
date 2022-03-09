class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] dir = {{-1,0}, {0,-1}};
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                
                if(i == 0 && j == 0) continue;
                
                int[] temp = {Integer.MAX_VALUE, Integer.MAX_VALUE};
                
                int count = 0;
                for(int[] direction : dir){
                    int new_r = i + direction[0];
                    int new_c = j + direction[1];
                    if((0 <= new_r && new_r < grid.length) && (0 <= new_c && new_c < grid[0].length)) {
                        temp[count++] = grid[new_r][new_c];
                    }
                }
                grid[i][j] += Math.min(temp[0], temp[1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
/*
    [[1]]
[[1,2]]
[[1,2],[1,2]]
*/