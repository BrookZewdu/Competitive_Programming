class Solution {
    private int[][] image;
    private int oldValue;
    private int newColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        this.oldValue = image[sr][sc];
        this.image = image;
        this.newColor = newColor;
        if(newColor == oldValue) return this.image;
        helper(sr,sc);
        
        return this.image;
        
        // return new int[0][0];        
    }
    public void helper(int row, int col){
        this.image[row][col] = newColor;
        if(row > 0 && image[row - 1][col] == oldValue){
           helper(row - 1, col); 
        }
        if(col > 0 && image[row][col - 1] == oldValue){
            helper(row, col - 1);
        }
        if(col < image[row].length - 1 && image[row][col + 1] == oldValue){
            helper(row, col + 1);
        }
        if(row < image.length - 1 && image[row + 1][col] == oldValue){
            helper(row + 1, col);
        }
        return;
    }

}
/*
[[1,2,2,2,2],[2,1,2,1,1],[2,2,2,1,1],[1,2,1,1,1],[2,2,1,1,2]]
2
2
3
*/