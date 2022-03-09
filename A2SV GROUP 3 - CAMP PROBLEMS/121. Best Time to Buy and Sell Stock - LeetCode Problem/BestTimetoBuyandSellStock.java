class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int max = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            int curr = 0;
            if(prices[i] < prices[i + 1]) curr = prices[i + 1] - prices[i];
            max = Math.max(max, curr);
            prices[i] = Math.max(prices[i], prices[i + 1]);
        }
        return max;
    }
}