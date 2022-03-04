class Solution {
    private int count = 0;
    int temp = 0;
    int max = 0;
    Queue<Integer> q = new LinkedList<>();
    int grid[][];
    int width;
    public int orangesRotting(int[][] grid) {
        this.width = grid[0].length;
        this.grid = grid;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                   q.add(i * width + j); 
                }
            }
        }
        bfs();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return count == 0 ? 0 : count - 1;
    }
    private void bfs(){
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                int r = q.peek() / width;
                int c = q.poll () % width;
                
                if(r > 0 && grid[r - 1][c] == 1) {
                    q.add((r - 1) * width + c);
                    grid[r - 1][c] = 2;
                }
                if(c > 0 && grid[r][c - 1] == 1) {
                    q.add(r * width + (c - 1));
                    grid[r][c - 1] = 2;
                }
                if(r < grid.length - 1 && grid[r + 1][c] == 1) {
                    q.add((r + 1) * width + c);
                    grid[r + 1][c] = 2;
                }
                if(c < grid[0].length - 1 && grid[r][c + 1] == 1) {
                    q.add(r * width + (c + 1)); 
                    grid[r][c + 1] = 2;
                }
                    
            }
            count++;
        }
        
    }
}