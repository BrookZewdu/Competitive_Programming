class Solution {
    private char[][] board;
    int[][] dir = {{1,0}, {0, 1}, {0, -1}, {-1, 0},{1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
    public char[][] updateBoard(char[][] board, int[] click) {
        this.board = board;
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        } 
        dfs(click[0], click[1]);
        return board;
    }
    
    private boolean isValid(int row, int col){
        if(col >= 0 && row >= 0 && row < board.length && col < board[0].length) return true;
        return false;
    }
    
    private void dfs(int row, int col){
        boolean flag = true;
        int count = 0;
        for(int[] direction : dir){
            int new_r = row + direction[0];
            int new_c = col + direction[1];
            if(isValid(new_r, new_c) && board[new_r][new_c] == 'M'){
                board[row][col] = ("" + ++count).charAt(0);
                flag = false;
            }
        }
        if(!flag) return;
        board[row][col] = 'B';
        for(int[] direction : dir){
            int new_r =- row + direction[0];
            int new_c = col + direction[1];
            if(isValid(new_r, new_c) && board[new_r][new_c] == 'E'){
                dfs(new_r, new_c);
            }
        }
    }
    
}