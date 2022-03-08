class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length < 2){
            int ans = flowerbed[0] == 0 ? 1 : 0;
            return n <= ans;
        }
        int count = 0;
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            count++;
        }
        for(int i = 1; i < flowerbed.length - 1; i++){
            if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                count++;
                flowerbed[i] = 1;
            }
            // System.out.println(Arrays.toString(flowerbed) + " : " + count);
        }
        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            flowerbed[flowerbed.length - 1] = 1;
            count++;
        }
        // System.out.println(count);
        return n <= count;
    }
}