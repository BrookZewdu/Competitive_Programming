class Solution {
    public int minIncrementForUnique(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = 1;
        int sum = 0;
        int abs = Math.abs(nums[p1] - nums[p2]);
        while(p2 < nums.length){
            if(nums[p1] >= nums[p2]){
                abs = Math.abs(nums[p1] - nums[p2])+1;
                nums[p2] = nums[p2] + abs;
                sum += abs;
            }
            p1++;
            p2++;
        }
        
       return sum;
    }
}