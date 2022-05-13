class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int best = -1;
        int count = 0;
        
        for(int mask = 0; mask < (1 << n); mask++) {
            
            int curr = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    curr |= nums[i];
                }
            }
            
            count = (curr > best) ? 1 : (curr == best) ? count + 1 : count; 
            best = (curr > best) ? curr : best;
            
        }
        
        return count;
    }
}