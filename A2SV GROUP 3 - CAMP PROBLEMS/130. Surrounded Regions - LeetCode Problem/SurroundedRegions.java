class Solution {
    public void solve(char[][] board) {
        
        for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[i].length; j++){
               if (( i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1)){
                   if(board[i][j] == 'O'){
                        dfs(board, i, j);
                   }
               }
           }
        }
        
         for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[i].length; j++){
               if(board[i][j] == 'O'){
                   board[i][j] = 'X';
               }
               if(board[i][j] == 'B'){
                   board[i][j] = 'O';
               }
           }
        }
        
        
    }
    public void dfs(char[][] board, int row, int col){
        if (row < 0 || col < 0 || row > board.length - 1 || col > board[0].length - 1) return;
        board[row][col] = 'B';
        if(row > 0 && board[row - 1][col] == 'O') dfs(board, row - 1, col);
        if(row < board.length - 1 && board[row + 1][col] == 'O') dfs(board, row + 1, col);
        if(col > 0 && board[row][col - 1] == 'O') dfs(board, row, col - 1);
        if(col < board[0].length - 1 && board[row][col + 1] == 'O') dfs(board, row, col + 1);
        
    }
}