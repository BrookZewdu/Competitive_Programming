class Solution {
    private long dp[];
    public long mostPoints(int[][] q) {
        this.dp = new long[q.length];
        return dp(q, 0);
    }
    
    private long dp (int[][] q, int index) {
        if (index >= q.length)
            return 0;
        
        if (dp[index] == 0) {
            
            int points = q[index][0];
            int jump = q[index][1];
            dp[index] = Math.max(points + dp (q, index + jump + 1),
                                dp (q, index + 1));
        }
        
        return dp[index];
    }
}