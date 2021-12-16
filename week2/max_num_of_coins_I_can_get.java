class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int[]coins = new int[piles.length/3];
        for(int i = piles.length-2,j = 0; i > 0 && j < coins.length; i-=2, j++){
            coins[j] = piles[i];
        }
        int sum = 0;
        
        for(int x:coins){
            sum += x;
        }
        return sum;
    }
}