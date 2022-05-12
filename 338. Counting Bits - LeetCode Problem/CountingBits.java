class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int j = 0; j <= n; j++) {
            
            for(int i = 31; i >= 0; i--) {
                if ((j & (1 << i)) !=0)
                    ans[j]++;
            }
        }
        return ans;
    }
}