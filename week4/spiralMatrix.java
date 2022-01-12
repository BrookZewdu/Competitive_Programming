class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int row_up = 0;
        int row_down = matrix.length - 1;
        int col_left = 0;
        int col_right = matrix[0].length - 1;
        while(true){
            //left
            for(int i = col_left; i <= col_right;i++) lst.add(matrix[row_up][i]);
            row_up++;
            if(row_up > row_down || col_left > col_right) break;
            //down
            for(int i = row_up; i <= row_down; i++) lst.add(matrix[i][col_right]);
            col_right--;
            if(row_up > row_down || col_left > col_right) break;
            //right
            for(int i = col_right; i >= col_left; i--) lst.add(matrix[row_down][i]);
            row_down--;
            if(row_up > row_down || col_left > col_right) break;
            //up
            for(int i = row_down; i >= row_up; i--) lst.add(matrix[i][col_left]);
            col_left++;
            if(row_up > row_down || col_left > col_right) break;
        }
         return lst;
    }
   
}