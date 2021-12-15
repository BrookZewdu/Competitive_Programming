class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] sorted = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    if(nums[j] < nums[i]){
                        count++;
                    }
                }
            }
            sorted[i] = count;
            count = 0;
        }
        return sorted;
    }
}
