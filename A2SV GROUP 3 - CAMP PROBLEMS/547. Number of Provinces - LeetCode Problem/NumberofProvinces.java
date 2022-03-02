class Solution {
    private int count = 0;
    public int findCircleNum(int[][] isConnected) {
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[i][i] == 1){
                helper(isConnected, i);
                count++;
            }
        }
        return count;
    }
    private void helper(int[][] isConnected, int row){
        if(isConnected[row][row] == 1) isConnected[row][row] = 0;
        else return;
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[row][i] == 1){
                isConnected[row][i] = 0;
                isConnected[i][row] = 0;
                helper(isConnected, i);
            }
        }
    }
}