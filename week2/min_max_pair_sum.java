class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum[] = new int[nums.length/2];
        for(int i = 0; i < nums.length/2; i++){
            sum[i] = nums[i] + nums[nums.length-1-i];
        }
        Arrays.sort(sum);
        return sum[sum.length-1];
    }
}
