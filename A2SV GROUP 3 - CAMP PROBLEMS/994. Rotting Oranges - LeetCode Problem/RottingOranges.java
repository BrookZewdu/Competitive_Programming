class Solution {
    public int orangesRotting(int[][] grid) {
        // time complexity -> O(row * col)
        // space complexity -> O(row * col); 
        class tupple <tupple>{
            int row, col, rotten_time;
            public tupple(int row, int col, int rotten_time){
                this.row = row;
                this.col = col;
                this.rotten_time = rotten_time;
            }
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<tupple> q = new LinkedList<>();
        int minutes = 0;
        int ones = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new tupple(i,j,0));
                }else if(grid[i][j] == 1){
                    ones++;
                }
                
            }
        }
        
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                int row = q.peek().row;
                int col = q.peek().col;
                int rotten_time = q.poll().rotten_time;
                minutes = rotten_time;
                for(int[] direction : dirs){
                    int new_row = row + direction[0];
                    int new_col = col + direction[1];
                    
                    if(isValid(grid, new_row, new_col) && grid[new_row][new_col] == 1){
                        q.add(new tupple(new_row, new_col, rotten_time + 1));
                        grid[new_row][new_col] = 2;
                        ones--;
                    }
                }
                
            }
            
        }
        return (ones == 0) ? minutes : -1;
        
    }
    private boolean isValid(int[][] grid, int row, int col){ 
        if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length) return true;
        return false;
    }
}
