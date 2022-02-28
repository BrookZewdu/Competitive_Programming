class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int row = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(matrix[mid][0] > target){
                right = mid - 1;
            }else if(matrix[mid][matrix[0].length - 1] < target){
                left = mid + 1;
            }else{
                row = mid;
                break;
            }
        }
        if(row == -1) return false;
        left = 0;
        right = matrix[0].length - 1;
        int col = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(matrix[row][mid] < target){
                left = mid + 1;
            }else if(matrix[row][mid] > target){
                right = mid - 1;
            }else{
                col = mid;
                break;
            }
        }
        return (col == -1) ? false : true;
    }
}